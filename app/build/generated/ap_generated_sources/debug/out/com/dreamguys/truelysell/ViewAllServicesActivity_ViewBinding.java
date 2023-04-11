// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.viewwidgets.CustomViewPager;
import com.google.android.material.tabs.TabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ViewAllServicesActivity_ViewBinding extends BaseActivity_ViewBinding {
  private ViewAllServicesActivity target;

  @UiThread
  public ViewAllServicesActivity_ViewBinding(ViewAllServicesActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ViewAllServicesActivity_ViewBinding(ViewAllServicesActivity target, View source) {
    super(target, source);

    this.target = target;

    target.tabServices = Utils.findRequiredViewAsType(source, R.id.tab_services, "field 'tabServices'", TabLayout.class);
    target.viewpagerServices = Utils.findRequiredViewAsType(source, R.id.viewpager_services, "field 'viewpagerServices'", CustomViewPager.class);
  }

  @Override
  public void unbind() {
    ViewAllServicesActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tabServices = null;
    target.viewpagerServices = null;

    super.unbind();
  }
}
