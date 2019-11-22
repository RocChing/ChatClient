package com.allenjuns.wechat.model;

public enum CmdType {
    Login(1), SendMsg(2), Error(0), Info(100);

    private int value;

    private CmdType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static CmdType getType(int value) {
        for (CmdType type : values()) {
            if (type.getValue() == value) {
                return type;
            }
        }
        return null;
    }
}
