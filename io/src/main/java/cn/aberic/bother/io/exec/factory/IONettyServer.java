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

package cn.aberic.bother.io.exec.factory;

import cn.aberic.bother.entity.enums.ProtocolStatus;
import cn.aberic.bother.entity.io.MessageData;
import cn.aberic.bother.entity.io.Remote;
import io.netty.channel.Channel;

/**
 * IO 服务端操作实现
 * <p>
 * 作者：Aberic on 2018/09/12 15:42
 * <p>
 * 邮箱：abericyang@gmail.com
 */
public class IONettyServer implements IOServer {

    private Channel channel;
    private Remote remote;

    public IONettyServer(Remote remote, Channel channel) {
        this.channel = channel;
        this.remote = remote;
    }

    @Override
    public void push(MessageData msgData) {
        channel.writeAndFlush(msgData);
    }

    @Override
    public Remote getRemote() {
        return remote;
    }

    @Override
    public void shutdown() {
        channel.writeAndFlush(new MessageData(ProtocolStatus.CLOSE, null));
        if (channel.isActive() || channel.isOpen()) {
            channel.close();
        }
    }

    @Override
    public boolean isConnected() {
        return channel.isActive();
    }
}
