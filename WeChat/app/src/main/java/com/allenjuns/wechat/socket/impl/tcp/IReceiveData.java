package com.allenjuns.wechat.socket.impl.tcp;

import com.allenjuns.wechat.socket.structures.message.Message;

public interface IReceiveData {
    void HandleMsg(Message msg);
}
