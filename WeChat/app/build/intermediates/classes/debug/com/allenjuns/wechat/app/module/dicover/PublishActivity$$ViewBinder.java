// Generated code from Butter Knife. Do not modify!
package com.allenjuns.wechat.app.module.dicover;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PublishActivity$$ViewBinder<T extends com.allenjuns.wechat.app.module.dicover.PublishActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624317, "field 'txt_title'");
    target.txt_title = finder.castView(view, 2131624317, "field 'txt_title'");
    view = finder.findRequiredView(source, 2131624522, "field 'txt_right'");
    target.txt_right = finder.castView(view, 2131624522, "field 'txt_right'");
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
    view = finder.findRequiredView(source, 2131624061, "field 'layout_title'");
    target.layout_title = view;
    view = finder.findRequiredView(source, 2131624020, "field 'scrollView'");
    target.scrollView = view;
    view = finder.findRequiredView(source, 2131624071, "field 'vRevealBackground'");
    target.vRevealBackground = finder.castView(view, 2131624071, "field 'vRevealBackground'");
  }

  @Override public void unbind(T target) {
    target.txt_title = null;
    target.txt_right = null;
    target.img_back = null;
    target.layout_title = null;
    target.scrollView = null;
    target.vRevealBackground = null;
  }
}
