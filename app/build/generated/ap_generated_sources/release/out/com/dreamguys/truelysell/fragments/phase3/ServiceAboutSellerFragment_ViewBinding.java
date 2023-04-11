// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import com.dreamguys.truelysell.viewwidgets.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ServiceAboutSellerFragment_ViewBinding implements Unbinder {
  private ServiceAboutSellerFragment target;

  private View view7f08026c;

  @UiThread
  public ServiceAboutSellerFragment_ViewBinding(final ServiceAboutSellerFragment target,
      View source) {
    this.target = target;

    View view;
    target.rvOtherServices = Utils.findRequiredViewAsType(source, R.id.rv_other_services, "field 'rvOtherServices'", RecyclerView.class);
    target.ivUserImage = Utils.findRequiredViewAsType(source, R.id.iv_user_image, "field 'ivUserImage'", CircleImageView.class);
    target.tvUsername = Utils.findRequiredViewAsType(source, R.id.tv_username, "field 'tvUsername'", TextView.class);
    target.tvEmailAddress = Utils.findRequiredViewAsType(source, R.id.tv_email_address, "field 'tvEmailAddress'", TextView.class);
    target.tvMobileNo = Utils.findRequiredViewAsType(source, R.id.tv_mobile_no, "field 'tvMobileNo'", TextView.class);
    view = Utils.findRequiredView(source, R.id.iv_locations, "field 'ivLocations' and method 'onViewClicked'");
    target.ivLocations = Utils.castView(view, R.id.iv_locations, "field 'ivLocations'", ImageView.class);
    view7f08026c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.tvProviderAddr = Utils.findRequiredViewAsType(source, R.id.tv_provider_addr, "field 'tvProviderAddr'", TextView.class);
    target.ivOtherServices = Utils.findRequiredViewAsType(source, R.id.iv_other_services, "field 'ivOtherServices'", ImageView.class);
    target.tvViewonmap = Utils.findRequiredViewAsType(source, R.id.tv_viewonmap, "field 'tvViewonmap'", TextView.class);
    target.rlOtherServices = Utils.findRequiredViewAsType(source, R.id.rl_other_services, "field 'rlOtherServices'", RelativeLayout.class);
    target.tvNoRecordsFound = Utils.findRequiredViewAsType(source, R.id.tv_no_records_found, "field 'tvNoRecordsFound'", TextView.class);
    target.ivCall = Utils.findRequiredViewAsType(source, R.id.iv_call, "field 'ivCall'", ImageView.class);
    target.ivChat = Utils.findRequiredViewAsType(source, R.id.iv_chat, "field 'ivChat'", ImageView.class);
    target.txtLocation = Utils.findRequiredViewAsType(source, R.id.txt_location, "field 'txtLocation'", TextView.class);
    target.txtOtherServices = Utils.findRequiredViewAsType(source, R.id.txt_other_services, "field 'txtOtherServices'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ServiceAboutSellerFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvOtherServices = null;
    target.ivUserImage = null;
    target.tvUsername = null;
    target.tvEmailAddress = null;
    target.tvMobileNo = null;
    target.ivLocations = null;
    target.tvProviderAddr = null;
    target.ivOtherServices = null;
    target.tvViewonmap = null;
    target.rlOtherServices = null;
    target.tvNoRecordsFound = null;
    target.ivCall = null;
    target.ivChat = null;
    target.txtLocation = null;
    target.txtOtherServices = null;

    view7f08026c.setOnClickListener(null);
    view7f08026c = null;
  }
}
