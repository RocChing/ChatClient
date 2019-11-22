// Generated code from Butter Knife. Do not modify!
package com.allenjuns.wechat.app.module.dicover;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class FeedActivity$$ViewBinder<T extends com.allenjuns.wechat.app.module.dicover.FeedActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624317, "field 'txt_title' and method 'goTop'");
    target.txt_title = finder.castView(view, 2131624317, "field 'txt_title'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.goTop();
        }
      });
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
    view = finder.findRequiredView(source, 2131624070, "field 'btn_add' and method 'btn_add_OnClick'");
    target.btn_add = finder.castView(view, 2131624070, "field 'btn_add'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btn_add_OnClick();
        }
      });
    view = finder.findRequiredView(source, 2131624048, "field 'mRefreshLayout'");
    target.mRefreshLayout = finder.castView(view, 2131624048, "field 'mRefreshLayout'");
    view = finder.findRequiredView(source, 2131624049, "field 'mlistview'");
    target.mlistview = finder.castView(view, 2131624049, "field 'mlistview'");
  }

  @Override public void unbind(T target) {
    target.txt_title = null;
    target.img_back = null;
    target.btn_add = null;
    target.mRefreshLayout = null;
    target.mlistview = null;
  }
}
