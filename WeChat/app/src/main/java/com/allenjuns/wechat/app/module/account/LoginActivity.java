package com.allenjuns.wechat.app.module.account;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.allenjuns.wechat.R;
import com.allenjuns.wechat.app.base.BaseActivity;
import com.allenjuns.wechat.app.model.account.LoginCallback;
import com.allenjuns.wechat.app.model.account.LoginModelImpl;
import com.allenjuns.wechat.common.MFGT;
import com.allenjuns.wechat.model.CmdInfo;
import com.allenjuns.wechat.model.CmdType;
import com.allenjuns.wechat.model.LoginInfo;
import com.allenjuns.wechat.service.ILoginCallback;
import com.allenjuns.wechat.service.MsgService;
import com.allenjuns.wechat.utils.CommonUtils;
import com.allenjuns.wechat.utils.L;
import com.allenjuns.wechat.utils.RegUtils;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Description :登录
 * Author : AllenJuns
 * Date   : 2016-3-03
 */
public class LoginActivity extends BaseActivity {
    @Bind(R.id.txt_title)
    TextView txt_title;
    @Bind(R.id.img_back)
    ImageView img_back;
    @Bind(R.id.et_usertel)
    EditText et_usertel;
    @Bind(R.id.et_password)
    EditText et_password;
    @Bind(R.id.btn_login)
    Button btn_login;

    private LoginModelImpl LoginModel;

    private ServiceConnection conn;
    private MsgService msgService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_login);
        super.onCreate(savedInstanceState);

        initService();

        Intent intent = new Intent(this, MsgService.class);
        bindService(intent, conn, BIND_AUTO_CREATE);
    }

    @Override
    protected void findView() {

    }

    @Override
    protected void initView() {
        txt_title.setText(getString(R.string.login_btn_action));
        img_back.setVisibility(View.VISIBLE);
        btn_login.setEnabled(true);
    }

    @Override
    protected void initData() {
        LoginModel = new LoginModelImpl();
    }

    @Override
    protected void setListener() {

    }

    //返回按钮点击事件
    @OnClick(R.id.img_back)
    public void close() {
        MFGT.finish(this);
    }

    //登录按钮点击事件
    @OnClick(R.id.btn_login)
    public void login() {
        String userName = et_usertel.getText().toString().trim();
        String userPwd = et_password.getText().toString().trim();

        checkForm(userName, userPwd);
    }

    private void checkForm(String userName, String userPwd) {
//        if(!RegUtils.isMobileNumber(userName)){
//            CommonUtils.showLongToast(getString(R.string.login_tip_tel_error));
//            return;
//        }
        if (RegUtils.isEmpty(userName)) {
            et_usertel.requestFocus();
            return;
        }

        if (RegUtils.isEmpty(userPwd)) {
            et_password.requestFocus();
            return;
        }

        LoginInfo loginInfo = new LoginInfo(userName, userPwd);
        String validString = getString(R.string.chat_valid_string);
        msgService.sendMsg(new CmdInfo(validString, CmdType.Login, loginInfo));
        //LoginModel.login(userName, userPwd, callback);
    }

    LoginCallback callback = new LoginCallback() {
        @Override
        public void onSuccess(String data) {
            L.e(data);
//            CommonUtils.showLongToast(data);
            MFGT.gotoMainActivity(LoginActivity.this);
            finish();
        }

        @Override
        public void onFailure(String error) {
//            CommonUtils.showLongToast(getString(R.string.login_tip_loginerror)+error);
            L.e(error);
        }
    };

    //注册按钮点击事件
    @OnClick(R.id.btn_register)
    public void regiseter() {
        MFGT.gotoRegister(this);
    }

    //遇到问题按钮点击事件
    @OnClick(R.id.tv_wenti)
    public void querstion() {
        CommonUtils.showLongToast(getString(R.string.login_txt_answer));
        //MFGT.gotoWebView(this, getString(R.string.discover_txt_shop), "http://www.baidu.com/");
    }

    private void initService() {
        conn = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                MsgService.LocalBinder binder = (MsgService.LocalBinder) iBinder;
                msgService = binder.getService();
                msgService.setLoginCallback(new ILoginCallback() {
                    @Override
                    public void success(CmdInfo info) {
                        MFGT.gotoMainActivity(LoginActivity.this);
                        finish();
                    }

                    @Override
                    public void error(String msg) {
                        Looper.prepare();
                        CommonUtils.showLongToast(msg);
                        Looper.loop();
                    }
                });
            }

            @Override
            public void onServiceDisconnected(ComponentName componentName) {
                msgService = null;
                L.d("msgService=null");
            }
        };
    }
}
