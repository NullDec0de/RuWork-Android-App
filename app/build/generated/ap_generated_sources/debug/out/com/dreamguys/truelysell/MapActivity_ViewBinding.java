// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MapActivity_ViewBinding implements Unbinder {
  private MapActivity target;

  private View view7f0800e2;

  @UiThread
  public MapActivity_ViewBinding(MapActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MapActivity_ViewBinding(final MapActivity target, View source) {
    this.target = target;

    View view;
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.tb_toolbar, "field 'mToolbar'", Toolbar.class);
    view = Utils.findRequiredView(source, R.id.bt_done, "field 'btDone' and method 'onViewClicked'");
    target.btDone = Utils.castView(view, R.id.bt_done, "field 'btDone'", Button.class);
    view7f0800e2 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MapActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mToolbar = null;
    target.btDone = null;

    view7f0800e2.setOnClickListener(null);
    view7f0800e2 = null;
  }
}
