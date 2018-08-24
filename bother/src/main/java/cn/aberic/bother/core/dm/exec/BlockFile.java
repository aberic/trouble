/*
 * MIT License
 *
 * Copyright (c) 2018 Aberic Yang
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package cn.aberic.bother.core.dm.exec;

import cn.aberic.bother.common.Common;
import cn.aberic.bother.core.dm.block.Block;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 区块文件本地读写——数据操作层-data manipulation
 *
 * 作者：Aberic on 2018/08/24 11:44
 * 邮箱：abericyang@gmail.com
 */
@Slf4j
public class BlockFile {

    volatile private static BlockFile instance;

    public static BlockFile obtain() {
        if (null == instance) {
            synchronized (BlockFile.class) {
                if (null == instance) {
                    instance = new BlockFile();
                }
            }
        }
        return instance;
    }

    public boolean create(int height, Block block) {
        File blockFile = new File(String.format("%s/block_file_%s.block", Common.BLOCK_FILE_DIR, height));
        try {
            if (!blockFile.getParentFile().exists()) {
                blockFile.getParentFile().mkdirs();
            }
            if (!blockFile.exists()) {
                blockFile.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(blockFile);
            byte[] bytes = JSON.toJSONString(block).getBytes();
            fos.write(bytes);
            fos.flush();
        } catch (IOException e) {
            log.error(String.format("block file create failed, %s", e.getMessage()));
            return false;
        }
        return true;
    }

    public Block read(int height) {
        File blockFile = new File(String.format("%s/block_file_%s.block", Common.BLOCK_FILE_DIR, height));
        try {
            if (!blockFile.exists()) {
                return null;
            }
            FileInputStream fis = new FileInputStream(blockFile);
            int length;
            byte[] bytes = new byte[1024];
            String read = "";
            while ((length = fis.read(bytes)) != -1) {
                read = new String(bytes, 0, length);
            }
            fis.close();
            return JSON.parseObject(read, new TypeReference<Block>() {});
        } catch (IOException e) {
            log.error(String.format("block file read failed, %s", e.getMessage()));
        }
        return null;
    }

}