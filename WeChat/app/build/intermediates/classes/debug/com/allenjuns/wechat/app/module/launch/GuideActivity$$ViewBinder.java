// Generated code from Butter Knife. Do not modify!
package com.allenjuns.wechat.app.module.launch;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class GuideActivity$$ViewBinder<T extends com.allenjuns.wechat.app.module.launch.GuideActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624086, "method 'img_login_OnClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.img_login_OnClick();
        }
      });
    view = finder.findRequiredView(source, 2131624087, "method 'img_register_OnClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.img_register_OnClick();
        }
      });
  }

  @Override public void unbind(T target) {
  }
}
