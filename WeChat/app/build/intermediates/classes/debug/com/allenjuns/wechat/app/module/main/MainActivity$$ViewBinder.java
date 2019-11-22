// Generated code from Butter Knife. Do not modify!
package com.allenjuns.wechat.app.module.main;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.allenjuns.wechat.app.module.main.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624317, "field 'txt_title'");
    target.txt_title = finder.castView(view, 2131624317, "field 'txt_title'");
    view = finder.findRequiredView(source, 2131624521, "field 'img_right' and method 'img_right_Click'");
    target.img_right = finder.castView(view, 2131624521, "field 'img_right'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.img_right_Click();
        }
      });
    view = finder.findRequiredView(source, 2131624095, "field 'mHost'");
    target.mHost = finder.castView(view, 2131624095, "field 'mHost'");
    view = finder.findRequiredView(source, 2131624094, "field 'viewpager'");
    target.viewpager = finder.castView(view, 2131624094, "field 'viewpager'");
  }

  @Override public void unbind(T target) {
    target.txt_title = null;
    target.img_right = null;
    target.mHost = null;
    target.viewpager = null;
  }
}
