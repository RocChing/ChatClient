// Generated code from Butter Knife. Do not modify!
package com.allenjuns.wechat.app.module.main;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class Fragment_Msg$$ViewBinder<T extends com.allenjuns.wechat.app.module.main.Fragment_Msg> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624049, "field 'mListView'");
    target.mListView = finder.castView(view, 2131624049, "field 'mListView'");
    view = finder.findRequiredView(source, 2131624048, "field 'mRefreshLayout'");
    target.mRefreshLayout = finder.castView(view, 2131624048, "field 'mRefreshLayout'");
  }

  @Override public void unbind(T target) {
    target.mListView = null;
    target.mRefreshLayout = null;
  }
}
