package com.allenjuns.wechat.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaCodecInfo;
import android.os.Binder;
import android.os.IBinder;
import android.util.JsonWriter;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.allenjuns.wechat.Entity.User;
import com.allenjuns.wechat.model.CmdInfo;
import com.allenjuns.wechat.model.CmdType;
import com.allenjuns.wechat.model.MsgInfo;

import com.allenjuns.wechat.socket.impl.tcp.IReceiveData;
import com.allenjuns.wechat.socket.impl.tcp.nio.NioClient;
import com.allenjuns.wechat.socket.structures.BaseClient;
import com.allenjuns.wechat.socket.structures.BaseMessageProcessor;
import com.allenjuns.wechat.socket.structures.IConnectListener;
import com.allenjuns.wechat.socket.structures.TcpAddress;
import com.allenjuns.wechat.socket.structures.message.Message;

import java.io.IOError;
import java.util.LinkedList;

public class MsgService extends Service {
    private final String TAG = "MsgService";
    private NioClient mClient;
    private String ip = "192.168.150.141";
    private int port = 8800;
    private LocalBinder mbinder = new LocalBinder();

    private ILoginCallback loginCallback;

    public MsgService() {

    }

    @Override
    public void onCreate() {
        Log.d(TAG, "service created");
        mClient = new NioClient(mMessageProcessor, mConnectResultListener, receiveData);
        mClient.setConnectAddress(new TcpAddress[]{
                new TcpAddress(ip, port)
        });
        mClient.connect();
    }

    @Override
    public void onDestroy() {
        mClient.disconnect();
    }

    /**
     * 发送消息
     *
     * @param msg
     */
    public void sendMsg(String msg) {
        mMessageProcessor.send(mClient, msg.getBytes());
    }

    public void sendMsg(CmdInfo info) {
        String json = JSON.toJSONString(info);
        Log.d(TAG, json);
        mMessageProcessor.send(mClient, json.getBytes());
    }


    @Override
    public IBinder onBind(Intent intent) {
        return mbinder;
    }

    private IConnectListener mConnectResultListener = new IConnectListener() {
        @Override
        public void onConnectionSuccess() {
            Log.d(TAG, "connected server success");
        }

        @Override
        public void onConnectionFailed() {
            Log.d(TAG, "connected server failed");
        }
    };

    private BaseMessageProcessor mMessageProcessor = new BaseMessageProcessor() {

        @Override
        public void onReceiveMessages(BaseClient mClient, final LinkedList<Message> mQueen) {
//            for (int i = 0; i < mQueen.size(); i++) {
//                Message msg = mQueen.get(i);
//                final String s = new String(msg.data, msg.offset, msg.length);
//                Log.d(TAG, s);
//            }
        }
    };

    private IReceiveData receiveData = new IReceiveData() {
        @Override
        public void HandleMsg(Message msg) {
            final String json = new String(msg.data, msg.offset, msg.length);
            CmdInfo info = JSON.parseObject(json, CmdInfo.class);
            if (info != null) {
                CmdType type = CmdType.getType(info.Type);
                switch (type) {
                    case Login:
                        if (loginCallback != null) {
                            loginCallback.success(info);
                        }
                        break;
                    case Error:
                        if (loginCallback != null) {
                            loginCallback.error(info.of(String.class));
                        }
                        break;
                }
            }
        }
    };

    public class LocalBinder extends Binder {
        public MsgService getService() {
            return MsgService.this;
        }

        public void end() {
            Log.e(TAG, "end:");
        }
    }

    public void setLoginCallback(ILoginCallback iLoginCallback) {
        this.loginCallback = iLoginCallback;
    }
}
