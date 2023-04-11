// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BookingsFragment_ViewBinding implements Unbinder {
  private BookingsFragment target;

  private View view7f080263;

  @UiThread
  public BookingsFragment_ViewBinding(final BookingsFragment target, View source) {
    this.target = target;

    View view;
    target.rvBookings = Utils.findRequiredViewAsType(source, R.id.rv_bookings, "field 'rvBookings'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.iv_filter, "field 'ivFilter' and method 'onViewClicked'");
    target.ivFilter = Utils.castView(view, R.id.iv_filter, "field 'ivFilter'", ImageView.class);
    view7f080263 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.tvNoRecordsFound = Utils.findRequiredViewAsType(source, R.id.tv_no_records_found, "field 'tvNoRecordsFound'", TextView.class);
    target.ivPopularServices = Utils.findRequiredViewAsType(source, R.id.iv_popular_services, "field 'ivPopularServices'", ImageView.class);
    target.txtBookingLists = Utils.findRequiredViewAsType(source, R.id.txt_booking_lists, "field 'txtBookingLists'", TextView.class);
    target.ivUserlogin = Utils.findRequiredViewAsType(source, R.id.iv_userlogin, "field 'ivUserlogin'", ImageView.class);
    target.ivSearch = Utils.findRequiredViewAsType(source, R.id.iv_search, "field 'ivSearch'", ImageView.class);
    target.tbToolbar = Utils.findRequiredViewAsType(source, R.id.tb_toolbar, "field 'tbToolbar'", Toolbar.class);
    target.appBar = Utils.findRequiredViewAsType(source, R.id.app_bar, "field 'appBar'", AppBarLayout.class);
    target.txtBookings = Utils.findRequiredViewAsType(source, R.id.txt_bookings, "field 'txtBookings'", TextView.class);
    target.IdNestedSV = Utils.findRequiredViewAsType(source, R.id.idNestedSV, "field 'IdNestedSV'", NestedScrollView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BookingsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvBookings = null;
    target.ivFilter = null;
    target.tvNoRecordsFound = null;
    target.ivPopularServices = null;
    target.txtBookingLists = null;
    target.ivUserlogin = null;
    target.ivSearch = null;
    target.tbToolbar = null;
    target.appBar = null;
    target.txtBookings = null;
    target.IdNestedSV = null;

    view7f080263.setOnClickListener(null);
    view7f080263 = null;
  }
}
