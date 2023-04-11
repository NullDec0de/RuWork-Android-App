// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SubCategoryServicesActivity_ViewBinding extends BaseActivity_ViewBinding {
  private SubCategoryServicesActivity target;

  @UiThread
  public SubCategoryServicesActivity_ViewBinding(SubCategoryServicesActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SubCategoryServicesActivity_ViewBinding(SubCategoryServicesActivity target, View source) {
    super(target, source);

    this.target = target;

    target.rvSubCategorylist = Utils.findRequiredViewAsType(source, R.id.rv_categorylist, "field 'rvSubCategorylist'", RecyclerView.class);
    target.tvNoRecordsFound = Utils.findRequiredViewAsType(source, R.id.tv_no_records_found, "field 'tvNoRecordsFound'", TextView.class);
    target.tvTitle = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'tvTitle'", TextView.class);
    target.ivPopularServices = Utils.findRequiredViewAsType(source, R.id.iv_popular_services, "field 'ivPopularServices'", ImageView.class);
  }

  @Override
  public void unbind() {
    SubCategoryServicesActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvSubCategorylist = null;
    target.tvNoRecordsFound = null;
    target.tvTitle = null;
    target.ivPopularServices = null;

    super.unbind();
  }
}
