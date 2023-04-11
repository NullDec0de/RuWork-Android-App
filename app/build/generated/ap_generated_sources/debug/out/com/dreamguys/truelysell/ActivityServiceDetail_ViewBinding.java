// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.viewwidgets.CustomViewPager;
import com.google.android.material.tabs.TabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ActivityServiceDetail_ViewBinding extends BaseActivity_ViewBinding {
  private ActivityServiceDetail target;

  private View view7f080109;

  @UiThread
  public ActivityServiceDetail_ViewBinding(ActivityServiceDetail target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityServiceDetail_ViewBinding(final ActivityServiceDetail target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.tabServiceDetail = Utils.findRequiredViewAsType(source, R.id.tab_service_detail, "field 'tabServiceDetail'", TabLayout.class);
    target.viewpagerServiceDetail = Utils.findRequiredViewAsType(source, R.id.viewpager_service_detail, "field 'viewpagerServiceDetail'", CustomViewPager.class);
    target.rlParent = Utils.findRequiredViewAsType(source, R.id.rl_parent, "field 'rlParent'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.btn_book, "field 'btnBook' and method 'onViewClicked'");
    target.btnBook = Utils.castView(view, R.id.btn_book, "field 'btnBook'", Button.class);
    view7f080109 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.txtMarkAsCompleted = Utils.findRequiredViewAsType(source, R.id.txt_mark_as_completed, "field 'txtMarkAsCompleted'", TextView.class);
  }

  @Override
  public void unbind() {
    ActivityServiceDetail target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tabServiceDetail = null;
    target.viewpagerServiceDetail = null;
    target.rlParent = null;
    target.btnBook = null;
    target.txtMarkAsCompleted = null;

    view7f080109.setOnClickListener(null);
    view7f080109 = null;

    super.unbind();
  }
}
