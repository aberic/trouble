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

package cn.aberic.bother.entity.token;

import lombok.Getter;
import lombok.Setter;

/**
 * 作者：Aberic on 2018/09/03 11:54
 * 邮箱：abericyang@gmail.com
 */
@Setter
@Getter
public class Token {

    /** ERC20 Token 的名字，例如：NoTroubleBother */
    private String name;
    /** ERC20 Token 的符号，也就是代币的简称，例如：NTB。 */
    private String symbol;
    /** 支持几位小数点后几位。如果设置为3。也就是支持0.001表示。 */
    private int decimals;
    /** 发行 Token 的总量 */
    private int totalSupply;
    /** Token 摘要 */
    private String brief;

}