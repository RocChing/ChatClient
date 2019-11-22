// Generated code from Butter Knife. Do not modify!
package com.allenjuns.wechat.app.module.account;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LoginActivity$$ViewBinder<T extends com.allenjuns.wechat.app.module.account.LoginActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624317, "field 'txt_title'");
    target.txt_title = finder.castView(view, 2131624317, "field 'txt_title'");
    view = finder.findRequiredView(source, 2131624062, "field 'img_back' and method 'close'");
    target.img_back = finder.castView(view, 2131624062, "field 'img_back'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.close();
        }
      });
    view = finder.findRequiredView(source, 2131624088, "field 'et_usertel'");
    target.et_usertel = finder.castView(view, 2131624088, "field 'et_usertel'");
    view = finder.findRequiredView(source, 2131624089, "field 'et_password'");
    target.et_password = finder.castView(view, 2131624089, "field 'et_password'");
    view = finder.findRequiredView(source, 2131624091, "field 'btn_login' and method 'login'");
    target.btn_login = finder.castView(view, 2131624091, "field 'btn_login'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.login();
        }
      });
    view = finder.findRequiredView(source, 2131624093, "method 'regiseter'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.regiseter();
        }
      });
    view = finder.findRequiredView(source, 2131624092, "method 'querstion'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.querstion();
        }
      });
  }

  @Override public void unbind(T target) {
    target.txt_title = null;
    target.img_back = null;
    target.et_usertel = null;
    target.et_password = null;
    target.btn_login = null;
  }
}
