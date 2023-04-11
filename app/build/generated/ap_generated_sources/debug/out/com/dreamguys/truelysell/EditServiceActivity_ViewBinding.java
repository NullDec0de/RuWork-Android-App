// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.viewwidgets.CustomViewPager;
import com.google.android.material.tabs.TabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EditServiceActivity_ViewBinding extends BaseActivity_ViewBinding {
  private EditServiceActivity target;

  @UiThread
  public EditServiceActivity_ViewBinding(EditServiceActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EditServiceActivity_ViewBinding(EditServiceActivity target, View source) {
    super(target, source);

    this.target = target;

    target.tabCreateProvider = Utils.findRequiredViewAsType(source, R.id.tab_create_provider, "field 'tabCreateProvider'", TabLayout.class);
    target.pagerCreateProvider = Utils.findRequiredViewAsType(source, R.id.pager_create_provider, "field 'pagerCreateProvider'", CustomViewPager.class);
  }

  @Override
  public void unbind() {
    EditServiceActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tabCreateProvider = null;
    target.pagerCreateProvider = null;

    super.unbind();
  }
}
