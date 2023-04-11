// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyProviderServicesActivity_ViewBinding extends BaseActivity_ViewBinding {
  private MyProviderServicesActivity target;

  private View view7f080264;

  @UiThread
  public MyProviderServicesActivity_ViewBinding(MyProviderServicesActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyProviderServicesActivity_ViewBinding(final MyProviderServicesActivity target,
      View source) {
    super(target, source);

    this.target = target;

    View view;
    target.rvMyservices = Utils.findRequiredViewAsType(source, R.id.rv_myservices, "field 'rvMyservices'", RecyclerView.class);
    target.tvNoRecordsFound = Utils.findRequiredViewAsType(source, R.id.tv_no_records_found, "field 'tvNoRecordsFound'", TextView.class);
    view = Utils.findRequiredView(source, R.id.iv_filter, "field 'ivFilter' and method 'onViewClicked'");
    target.ivFilter = Utils.castView(view, R.id.iv_filter, "field 'ivFilter'", ImageView.class);
    view7f080264 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.ivPopularServices = Utils.findRequiredViewAsType(source, R.id.iv_popular_services, "field 'ivPopularServices'", ImageView.class);
    target.txtMyProviders = Utils.findRequiredViewAsType(source, R.id.txt_my_providers, "field 'txtMyProviders'", TextView.class);
  }

  @Override
  public void unbind() {
    MyProviderServicesActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvMyservices = null;
    target.tvNoRecordsFound = null;
    target.ivFilter = null;
    target.ivPopularServices = null;
    target.txtMyProviders = null;

    view7f080264.setOnClickListener(null);
    view7f080264 = null;

    super.unbind();
  }
}
