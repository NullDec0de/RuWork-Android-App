// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.adapters;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SubscriptionAdapter$ViewHolder_ViewBinding implements Unbinder {
  private SubscriptionAdapter.ViewHolder target;

  @UiThread
  public SubscriptionAdapter$ViewHolder_ViewBinding(SubscriptionAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.tvSubsType = Utils.findRequiredViewAsType(source, R.id.tv_subs_type, "field 'tvSubsType'", TextView.class);
    target.tvSubsPrice = Utils.findRequiredViewAsType(source, R.id.tv_subs_price, "field 'tvSubsPrice'", TextView.class);
    target.tvSubsPriceType = Utils.findRequiredViewAsType(source, R.id.tv_subs_price_type, "field 'tvSubsPriceType'", TextView.class);
    target.tvSubsValidUpto = Utils.findRequiredViewAsType(source, R.id.tv_subs_valid_upto, "field 'tvSubsValidUpto'", TextView.class);
    target.btnBuyNow = Utils.findRequiredViewAsType(source, R.id.btn_buy_now, "field 'btnBuyNow'", Button.class);
    target.cardView = Utils.findRequiredViewAsType(source, R.id.card_view, "field 'cardView'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SubscriptionAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvSubsType = null;
    target.tvSubsPrice = null;
    target.tvSubsPriceType = null;
    target.tvSubsValidUpto = null;
    target.btnBuyNow = null;
    target.cardView = null;
  }
}
