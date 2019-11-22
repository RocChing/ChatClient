package com.allenjuns.wechat.service;

import com.allenjuns.wechat.model.CmdInfo;

public interface ILoginCallback {
    void success(CmdInfo info);
    void error(String msg);
}
