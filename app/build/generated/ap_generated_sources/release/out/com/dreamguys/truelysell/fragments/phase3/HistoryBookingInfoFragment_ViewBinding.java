// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HistoryBookingInfoFragment_ViewBinding implements Unbinder {
  private HistoryBookingInfoFragment target;

  @UiThread
  public HistoryBookingInfoFragment_ViewBinding(HistoryBookingInfoFragment target, View source) {
    this.target = target;

    target.ivAppntSlot = Utils.findRequiredViewAsType(source, R.id.iv_appnt_slot, "field 'ivAppntSlot'", ImageView.class);
    target.tvBookedDate = Utils.findRequiredViewAsType(source, R.id.tv_booked_date, "field 'tvBookedDate'", TextView.class);
    target.tvFromtime = Utils.findRequiredViewAsType(source, R.id.tv_fromtime, "field 'tvFromtime'", TextView.class);
    target.tvTotime = Utils.findRequiredViewAsType(source, R.id.tv_totime, "field 'tvTotime'", TextView.class);
    target.ivBuyerMsg = Utils.findRequiredViewAsType(source, R.id.iv_buyer_msg, "field 'ivBuyerMsg'", ImageView.class);
    target.etDescription = Utils.findRequiredViewAsType(source, R.id.et_description, "field 'etDescription'", EditText.class);
    target.llBookingInfo = Utils.findRequiredViewAsType(source, R.id.ll_booking_info, "field 'llBookingInfo'", LinearLayout.class);
    target.etRejectedReason = Utils.findRequiredViewAsType(source, R.id.et_rejected_reason, "field 'etRejectedReason'", EditText.class);
    target.etAdminComments = Utils.findRequiredViewAsType(source, R.id.et_admin_comments, "field 'etAdminComments'", EditText.class);
    target.rlRejectedReason = Utils.findRequiredViewAsType(source, R.id.rl_rejected_reason, "field 'rlRejectedReason'", RelativeLayout.class);
    target.rlAdminComments = Utils.findRequiredViewAsType(source, R.id.rl_admin_comments, "field 'rlAdminComments'", RelativeLayout.class);
    target.ivRejectedReason = Utils.findRequiredViewAsType(source, R.id.iv_rejected_reason, "field 'ivRejectedReason'", ImageView.class);
    target.ivAdminComments = Utils.findRequiredViewAsType(source, R.id.iv_admin_comments, "field 'ivAdminComments'", ImageView.class);
    target.tvFrom = Utils.findRequiredViewAsType(source, R.id.tv_from, "field 'tvFrom'", TextView.class);
    target.tvTo = Utils.findRequiredViewAsType(source, R.id.tv_to, "field 'tvTo'", TextView.class);
    target.txtAppointmentSlot = Utils.findRequiredViewAsType(source, R.id.txt_appointment_slot, "field 'txtAppointmentSlot'", TextView.class);
    target.txtMessageFromBuyers = Utils.findRequiredViewAsType(source, R.id.txt_message_from_buyers, "field 'txtMessageFromBuyers'", TextView.class);
    target.txtRejectedReason = Utils.findRequiredViewAsType(source, R.id.txt_rejected_reason, "field 'txtRejectedReason'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HistoryBookingInfoFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivAppntSlot = null;
    target.tvBookedDate = null;
    target.tvFromtime = null;
    target.tvTotime = null;
    target.ivBuyerMsg = null;
    target.etDescription = null;
    target.llBookingInfo = null;
    target.etRejectedReason = null;
    target.etAdminComments = null;
    target.rlRejectedReason = null;
    target.rlAdminComments = null;
    target.ivRejectedReason = null;
    target.ivAdminComments = null;
    target.tvFrom = null;
    target.tvTo = null;
    target.txtAppointmentSlot = null;
    target.txtMessageFromBuyers = null;
    target.txtRejectedReason = null;
  }
}
