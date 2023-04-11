// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseActivity_ViewBinding implements Unbinder {
  private BaseActivity target;

  private View view7f080294;

  private View view7f080283;

  @UiThread
  public BaseActivity_ViewBinding(BaseActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BaseActivity_ViewBinding(final BaseActivity target, View source) {
    this.target = target;

    View view;
    target.tvTitlename = Utils.findRequiredViewAsType(source, R.id.tv_titlename, "field 'tvTitlename'", TextView.class);
    view = Utils.findRequiredView(source, R.id.iv_userlogin, "field 'ivUserlogin' and method 'onViewClicked'");
    target.ivUserlogin = Utils.castView(view, R.id.iv_userlogin, "field 'ivUserlogin'", ImageView.class);
    view7f080294 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_search, "field 'ivSearch' and method 'onViewClicked'");
    target.ivSearch = Utils.castView(view, R.id.iv_search, "field 'ivSearch'", ImageView.class);
    view7f080283 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    BaseActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvTitlename = null;
    target.ivUserlogin = null;
    target.ivSearch = null;

    view7f080294.setOnClickListener(null);
    view7f080294 = null;
    view7f080283.setOnClickListener(null);
    view7f080283 = null;
  }
}
