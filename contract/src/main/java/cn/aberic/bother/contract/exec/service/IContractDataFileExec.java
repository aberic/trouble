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

package cn.aberic.bother.contract.exec.service;

import cn.aberic.bother.block.exec.service.IInit;
import cn.aberic.bother.storage.FileComponent;
import cn.aberic.bother.storage.IFile;

import java.io.File;

/**
 * 智能合约数据文件对象操作接口-smart contract
 * <p>
 * 作者：Aberic on 2018/08/31 11:28
 * 邮箱：abericyang@gmail.com
 */
public interface IContractDataFileExec extends IInit, IFile<String> {

    /**
     * 将根据旧版hash所指定智能合约数据文件夹重命名为新版hash
     *
     * @param contractOldHash 旧版hash
     */
    default boolean renameContractFile(String contractOldHash) {
        // 旧版hash所在文件夹路径
        File file = new File(FileComponent.getContractDataFileComponent(contractOldHash).getDir());
        // 将原文件夹更改为新版hash
        return file.renameTo(new File(getFileStatus().getDir()));
    }

}