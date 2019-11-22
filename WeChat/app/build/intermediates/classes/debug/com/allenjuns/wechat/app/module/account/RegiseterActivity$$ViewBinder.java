// Generated code from Butter Knife. Do not modify!
package com.allenjuns.wechat.app.module.account;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RegiseterActivity$$ViewBinder<T extends com.allenjuns.wechat.app.module.account.RegiseterActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131624088, "field 'userNameEditText'");
    target.userNameEditText = finder.castView(view, 2131624088, "field 'userNameEditText'");
    view = finder.findRequiredView(source, 2131624089, "field 'passwordEditText'");
    target.passwordEditText = finder.castView(view, 2131624089, "field 'passwordEditText'");
    view = finder.findRequiredView(source, 2131624113, "field 'et_codeEditText'");
    target.et_codeEditText = finder.castView(view, 2131624113, "field 'et_codeEditText'");
    view = finder.findRequiredView(source, 2131624114, "method 'btn_send'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btn_send();
        }
      });
    view = finder.findRequiredView(source, 2131624093, "method 'btn_register'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btn_register();
        }
      });
  }

  @Override public void unbind(T target) {
    target.txt_title = null;
    target.img_back = null;
    target.userNameEditText = null;
    target.passwordEditText = null;
    target.et_codeEditText = null;
  }
}
