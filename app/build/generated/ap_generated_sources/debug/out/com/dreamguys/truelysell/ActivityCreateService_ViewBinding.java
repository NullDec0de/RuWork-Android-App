// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.viewwidgets.CustomViewPager;
import com.google.android.material.tabs.TabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ActivityCreateService_ViewBinding implements Unbinder {
  private ActivityCreateService target;

  @UiThread
  public ActivityCreateService_ViewBinding(ActivityCreateService target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityCreateService_ViewBinding(ActivityCreateService target, View source) {
    this.target = target;

    target.tabCreateService = Utils.findRequiredViewAsType(source, R.id.tab_create_service, "field 'tabCreateService'", TabLayout.class);
    target.viewpagerCreateService = Utils.findRequiredViewAsType(source, R.id.viewpager_create_service, "field 'viewpagerCreateService'", CustomViewPager.class);
    target.ivBack = Utils.findRequiredViewAsType(source, R.id.iv_back, "field 'ivBack'", ImageView.class);
    target.tvTitlename = Utils.findRequiredViewAsType(source, R.id.tv_titlename, "field 'tvTitlename'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ActivityCreateService target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tabCreateService = null;
    target.viewpagerCreateService = null;
    target.ivBack = null;
    target.tvTitlename = null;
  }
}
