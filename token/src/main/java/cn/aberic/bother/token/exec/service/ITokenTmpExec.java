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
 *
 */

package cn.aberic.bother.token.exec.service;

import cn.aberic.bother.entity.token.Token;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;

/**
 * Token 临时文件本地读写接口
 * <p>
 * 作者：Aberic on 2018/9/5 21:17
 * <p>
 * 邮箱：abericyang@gmail.com
 */
public interface ITokenTmpExec extends ITokenExec {

    /**
     * 通过账户地址得到 Token 信息
     * <p>
     * 注：此方法仅限未发布 Token 使用
     *
     * @param accountAddress 账户地址
     *
     * @return Token 信息
     */
    default Token getUnPublish(String accountAddress) {
        Token[] tokens = new Token[]{null};
        Files.fileTraverser().breadthFirst(new File(getFileStatus().getDir())).forEach(file -> {
            if (StringUtils.startsWith(file.getName(), getFileStatus().getStart())) {
                try (LineIterator it = FileUtils.lineIterator(file, "UTF-8")) {
                    while (it.hasNext()) {
                        String lineString = it.nextLine();
                        if (StringUtils.isEmpty(lineString)) {
                            continue;
                        }
                        Token token = JSON.parseObject(lineString, new TypeReference<Token>() {});
                        if (StringUtils.equals(token.getAccount().getAddress(), accountAddress)) {
                            tokens[0] = token;
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        return tokens[0];
    }

}
