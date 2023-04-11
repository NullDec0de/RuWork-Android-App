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

public class SearchServicesActivity_ViewBinding extends BaseActivity_ViewBinding {
  private SearchServicesActivity target;

  @UiThread
  public SearchServicesActivity_ViewBinding(SearchServicesActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SearchServicesActivity_ViewBinding(SearchServicesActivity target, View source) {
    super(target, source);

    this.target = target;

    target.rvSearchServices = Utils.findRequiredViewAsType(source, R.id.rv_search_services, "field 'rvSearchServices'", RecyclerView.class);
    target.tvNoRecordsFound = Utils.findRequiredViewAsType(source, R.id.tv_no_records_found, "field 'tvNoRecordsFound'", TextView.class);
    target.ivPopularServices = Utils.findRequiredViewAsType(source, R.id.iv_popular_services, "field 'ivPopularServices'", ImageView.class);
    target.txtNoNotificationsFound = Utils.findRequiredViewAsType(source, R.id.txt_no_notifications_found, "field 'txtNoNotificationsFound'", TextView.class);
  }

  @Override
  public void unbind() {
    SearchServicesActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvSearchServices = null;
    target.tvNoRecordsFound = null;
    target.ivPopularServices = null;
    target.txtNoNotificationsFound = null;

    super.unbind();
  }
}
