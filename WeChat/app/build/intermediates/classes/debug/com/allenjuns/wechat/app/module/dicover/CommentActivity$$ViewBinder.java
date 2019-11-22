// Generated code from Butter Knife. Do not modify!
package com.allenjuns.wechat.app.module.dicover;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CommentActivity$$ViewBinder<T extends com.allenjuns.wechat.app.module.dicover.CommentActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131624065, "field 'firstView'");
    target.firstView = view;
    view = finder.findRequiredView(source, 2131624067, "field 'secondView'");
    target.secondView = view;
    view = finder.findRequiredView(source, 2131624066, "method 'Open'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.Open();
        }
      });
    view = finder.findRequiredView(source, 2131624068, "method 'Hidden'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.Hidden();
        }
      });
  }

  @Override public void unbind(T target) {
    target.txt_title = null;
    target.img_back = null;
    target.firstView = null;
    target.secondView = null;
  }
}
