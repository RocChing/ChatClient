// Generated code from Butter Knife. Do not modify!
package com.allenjuns.wechat.app.module.main;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class Fragment_Profile$$ViewBinder<T extends com.allenjuns.wechat.app.module.main.Fragment_Profile> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624294, "method 'txt_album_Click'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.txt_album_Click();
        }
      });
    view = finder.findRequiredView(source, 2131624295, "method 'txt_collect_Click'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.txt_collect_Click();
        }
      });
    view = finder.findRequiredView(source, 2131624296, "method 'txt_money_Click'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.txt_money_Click();
        }
      });
    view = finder.findRequiredView(source, 2131624297, "method 'txt_card_Click'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.txt_card_Click();
        }
      });
    view = finder.findRequiredView(source, 2131624298, "method 'txt_smail_Click'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.txt_smail_Click();
        }
      });
    view = finder.findRequiredView(source, 2131624299, "method 'setting_Click'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.setting_Click();
        }
      });
    view = finder.findRequiredView(source, 2131624096, "method 'profile_Click'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.profile_Click();
        }
      });
  }

  @Override public void unbind(T target) {
  }
}
