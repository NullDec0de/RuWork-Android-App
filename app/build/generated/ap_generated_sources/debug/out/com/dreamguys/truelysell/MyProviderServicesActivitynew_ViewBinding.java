// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.viewwidgets.CustomViewPager;
import com.google.android.material.tabs.TabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyProviderServicesActivitynew_ViewBinding extends BaseActivity_ViewBinding {
  private MyProviderServicesActivitynew target;

  @UiThread
  public MyProviderServicesActivitynew_ViewBinding(MyProviderServicesActivitynew target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyProviderServicesActivitynew_ViewBinding(MyProviderServicesActivitynew target,
      View source) {
    super(target, source);

    this.target = target;

    target.tabMyService = Utils.findRequiredViewAsType(source, R.id.tab_my_service, "field 'tabMyService'", TabLayout.class);
    target.viewpagerMyService = Utils.findRequiredViewAsType(source, R.id.viewpager_my_service, "field 'viewpagerMyService'", CustomViewPager.class);
  }

  @Override
  public void unbind() {
    MyProviderServicesActivitynew target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tabMyService = null;
    target.viewpagerMyService = null;

    super.unbind();
  }
}
