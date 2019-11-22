// Generated code from Butter Knife. Do not modify!
package com.allenjuns.wechat.app.module.main;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class Fragment_Dicover$$ViewBinder<T extends com.allenjuns.wechat.app.module.main.Fragment_Dicover> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624283, "method 'txt_pengyouquan_Click'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.txt_pengyouquan_Click();
        }
      });
    view = finder.findRequiredView(source, 2131624284, "method 'txt_saoyisao_Click'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.txt_saoyisao_Click();
        }
      });
    view = finder.findRequiredView(source, 2131624285, "method 'txt_yaoyiyao_Click'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.txt_yaoyiyao_Click();
        }
      });
    view = finder.findRequiredView(source, 2131624286, "method 'txt_nearby_Click'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.txt_nearby_Click();
        }
      });
    view = finder.findRequiredView(source, 2131624287, "method 'txt_piaoliuping_Click'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.txt_piaoliuping_Click();
        }
      });
    view = finder.findRequiredView(source, 2131624288, "method 'txt_shop_Click'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.txt_shop_Click();
        }
      });
    view = finder.findRequiredView(source, 2131624289, "method 'txt_game_Click'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.txt_game_Click();
        }
      });
  }

  @Override public void unbind(T target) {
  }
}
