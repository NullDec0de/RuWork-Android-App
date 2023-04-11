// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import com.dreamguys.truelysell.viewwidgets.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ServiceAboutBuyerFragment_ViewBinding implements Unbinder {
  private ServiceAboutBuyerFragment target;

  @UiThread
  public ServiceAboutBuyerFragment_ViewBinding(ServiceAboutBuyerFragment target, View source) {
    this.target = target;

    target.ivUserImage = Utils.findRequiredViewAsType(source, R.id.iv_user_image, "field 'ivUserImage'", CircleImageView.class);
    target.tvUsername = Utils.findRequiredViewAsType(source, R.id.tv_username, "field 'tvUsername'", TextView.class);
    target.tvEmailAddress = Utils.findRequiredViewAsType(source, R.id.tv_email_address, "field 'tvEmailAddress'", TextView.class);
    target.tvMobileNo = Utils.findRequiredViewAsType(source, R.id.tv_mobile_no, "field 'tvMobileNo'", TextView.class);
    target.ivLocations = Utils.findRequiredViewAsType(source, R.id.iv_locations, "field 'ivLocations'", ImageView.class);
    target.tvProviderAddr = Utils.findRequiredViewAsType(source, R.id.tv_provider_addr, "field 'tvProviderAddr'", TextView.class);
    target.ivOtherServices = Utils.findRequiredViewAsType(source, R.id.iv_other_services, "field 'ivOtherServices'", ImageView.class);
    target.tvViewonMap = Utils.findRequiredViewAsType(source, R.id.tv_viewonmap, "field 'tvViewonMap'", TextView.class);
    target.rlOtherServices = Utils.findRequiredViewAsType(source, R.id.rl_other_services, "field 'rlOtherServices'", RelativeLayout.class);
    target.rvOtherServices = Utils.findRequiredViewAsType(source, R.id.rv_other_services, "field 'rvOtherServices'", RecyclerView.class);
    target.ivCall = Utils.findRequiredViewAsType(source, R.id.iv_call, "field 'ivCall'", ImageView.class);
    target.ivChat = Utils.findRequiredViewAsType(source, R.id.iv_chat, "field 'ivChat'", ImageView.class);
    target.tvNoRecordsFound = Utils.findRequiredViewAsType(source, R.id.tv_no_records_found, "field 'tvNoRecordsFound'", TextView.class);
    target.txtLocation = Utils.findRequiredViewAsType(source, R.id.txt_location, "field 'txtLocation'", TextView.class);
    target.txtOtherServices = Utils.findRequiredViewAsType(source, R.id.txt_other_services, "field 'txtOtherServices'", TextView.class);
    target.report = Utils.findRequiredViewAsType(source, R.id.report, "field 'report'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ServiceAboutBuyerFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivUserImage = null;
    target.tvUsername = null;
    target.tvEmailAddress = null;
    target.tvMobileNo = null;
    target.ivLocations = null;
    target.tvProviderAddr = null;
    target.ivOtherServices = null;
    target.tvViewonMap = null;
    target.rlOtherServices = null;
    target.rvOtherServices = null;
    target.ivCall = null;
    target.ivChat = null;
    target.tvNoRecordsFound = null;
    target.txtLocation = null;
    target.txtOtherServices = null;
    target.report = null;
  }
}
