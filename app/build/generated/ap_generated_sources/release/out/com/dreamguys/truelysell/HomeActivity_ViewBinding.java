// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.TabBar.CustomTabBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeActivity_ViewBinding implements Unbinder {
  private HomeActivity target;

  @UiThread
  public HomeActivity_ViewBinding(HomeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HomeActivity_ViewBinding(HomeActivity target, View source) {
    this.target = target;

    target.fragmentFrameLayout = Utils.findRequiredViewAsType(source, R.id.fragment_frame_layout, "field 'fragmentFrameLayout'", FrameLayout.class);
    target.customTabBar = Utils.findRequiredViewAsType(source, R.id.ctb_tabbar, "field 'customTabBar'", CustomTabBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.fragmentFrameLayout = null;
    target.customTabBar = null;
  }
}
