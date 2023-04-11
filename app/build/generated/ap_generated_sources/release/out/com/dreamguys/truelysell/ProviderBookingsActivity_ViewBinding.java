// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ProviderBookingsActivity_ViewBinding extends BaseActivity_ViewBinding {
  private ProviderBookingsActivity target;

  private View view7f080264;

  @UiThread
  public ProviderBookingsActivity_ViewBinding(ProviderBookingsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ProviderBookingsActivity_ViewBinding(final ProviderBookingsActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.rvBookings = Utils.findRequiredViewAsType(source, R.id.rv_bookings, "field 'rvBookings'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.iv_filter, "field 'ivFilter' and method 'onViewClicked'");
    target.ivFilter = Utils.castView(view, R.id.iv_filter, "field 'ivFilter'", ImageView.class);
    view7f080264 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.tvNoRecordsFound = Utils.findRequiredViewAsType(source, R.id.tv_no_records_found, "field 'tvNoRecordsFound'", TextView.class);
    target.appbar = Utils.findRequiredViewAsType(source, R.id.app_bar, "field 'appbar'", AppBarLayout.class);
    target.ivPopularServices = Utils.findRequiredViewAsType(source, R.id.iv_popular_services, "field 'ivPopularServices'", ImageView.class);
    target.txtBookingLists = Utils.findRequiredViewAsType(source, R.id.txt_booking_lists, "field 'txtBookingLists'", TextView.class);
    target.txtBookings = Utils.findRequiredViewAsType(source, R.id.txt_bookings, "field 'txtBookings'", TextView.class);
  }

  @Override
  public void unbind() {
    ProviderBookingsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvBookings = null;
    target.ivFilter = null;
    target.tvNoRecordsFound = null;
    target.appbar = null;
    target.ivPopularServices = null;
    target.txtBookingLists = null;
    target.txtBookings = null;

    view7f080264.setOnClickListener(null);
    view7f080264 = null;

    super.unbind();
  }
}
