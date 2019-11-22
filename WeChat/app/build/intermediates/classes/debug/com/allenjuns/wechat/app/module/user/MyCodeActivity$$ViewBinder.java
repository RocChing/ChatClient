// Generated code from Butter Knife. Do not modify!
package com.allenjuns.wechat.app.module.user;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MyCodeActivity$$ViewBinder<T extends com.allenjuns.wechat.app.module.user.MyCodeActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131624101, "field 'img_code'");
    target.img_code = finder.castView(view, 2131624101, "field 'img_code'");
    view = finder.findRequiredView(source, 2131624097, "field 'img_head'");
    target.img_head = finder.castView(view, 2131624097, "field 'img_head'");
    view = finder.findRequiredView(source, 2131624100, "field 'img_sex'");
    target.img_sex = finder.castView(view, 2131624100, "field 'img_sex'");
    view = finder.findRequiredView(source, 2131624098, "field 'txt_name'");
    target.txt_name = finder.castView(view, 2131624098, "field 'txt_name'");
    view = finder.findRequiredView(source, 2131624099, "field 'txt_id'");
    target.txt_id = finder.castView(view, 2131624099, "field 'txt_id'");
  }

  @Override public void unbind(T target) {
    target.txt_title = null;
    target.img_back = null;
    target.img_code = null;
    target.img_head = null;
    target.img_sex = null;
    target.txt_name = null;
    target.txt_id = null;
  }
}
