// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.viewwidgets.CustomViewPager;
import com.google.android.material.tabs.TabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ActivityBookService_ViewBinding extends BaseActivity_ViewBinding {
  private ActivityBookService target;

  @UiThread
  public ActivityBookService_ViewBinding(ActivityBookService target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityBookService_ViewBinding(ActivityBookService target, View source) {
    super(target, source);

    this.target = target;

    target.tabServiceDetail = Utils.findRequiredViewAsType(source, R.id.tab_book_service, "field 'tabServiceDetail'", TabLayout.class);
    target.viewpagerServiceDetail = Utils.findRequiredViewAsType(source, R.id.viewpager_book_service, "field 'viewpagerServiceDetail'", CustomViewPager.class);
  }

  @Override
  public void unbind() {
    ActivityBookService target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tabServiceDetail = null;
    target.viewpagerServiceDetail = null;

    super.unbind();
  }
}
