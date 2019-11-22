// Generated code from Butter Knife. Do not modify!
package com.allenjuns.wechat.app.module.chat;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ChatActivity$$ViewBinder<T extends com.allenjuns.wechat.app.module.chat.ChatActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131624049, "field 'mlistview'");
    target.mlistview = finder.castView(view, 2131624049, "field 'mlistview'");
    view = finder.findRequiredView(source, 2131624056, "field 'll_face_container'");
    target.ll_face_container = view;
    view = finder.findRequiredView(source, 2131624058, "field 'll_btn_container'");
    target.ll_btn_container = view;
    view = finder.findRequiredView(source, 2131624055, "field 'll_vole'");
    target.ll_vole = view;
    view = finder.findRequiredView(source, 2131624051, "method 'btn_vol'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btn_vol();
        }
      });
    view = finder.findRequiredView(source, 2131624052, "method 'btn_smail'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btn_smail();
        }
      });
    view = finder.findRequiredView(source, 2131624053, "method 'btn_tools'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btn_tools();
        }
      });
  }

  @Override public void unbind(T target) {
    target.txt_title = null;
    target.img_back = null;
    target.mlistview = null;
    target.ll_face_container = null;
    target.ll_btn_container = null;
    target.ll_vole = null;
  }
}
