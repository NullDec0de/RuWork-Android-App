// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.wallet;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CardListActivity_ViewBinding implements Unbinder {
  private CardListActivity target;

  @UiThread
  public CardListActivity_ViewBinding(CardListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CardListActivity_ViewBinding(CardListActivity target, View source) {
    this.target = target;

    target.titleWallet = Utils.findRequiredViewAsType(source, R.id.title_wallet, "field 'titleWallet'", TextView.class);
    target.tvGigsTitle = Utils.findRequiredViewAsType(source, R.id.tv_gigs_title, "field 'tvGigsTitle'", TextView.class);
    target.textCurrentBalance = Utils.findRequiredViewAsType(source, R.id.text_current_balance, "field 'textCurrentBalance'", TextView.class);
    target.txtMinimumAmountOf50 = Utils.findRequiredViewAsType(source, R.id.txt_minimum_amount_of_50, "field 'txtMinimumAmountOf50'", TextView.class);
    target.labelAddCard = Utils.findRequiredViewAsType(source, R.id.label_add_card, "field 'labelAddCard'", TextView.class);
    target.textCardExpiry = Utils.findRequiredViewAsType(source, R.id.text_card_expiry, "field 'textCardExpiry'", TextView.class);
    target.textCvv = Utils.findRequiredViewAsType(source, R.id.text_cvv, "field 'textCvv'", TextView.class);
    target.txtCardSecure = Utils.findRequiredViewAsType(source, R.id.txt_card_secure, "field 'txtCardSecure'", TextView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.tb_wallet, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CardListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleWallet = null;
    target.tvGigsTitle = null;
    target.textCurrentBalance = null;
    target.txtMinimumAmountOf50 = null;
    target.labelAddCard = null;
    target.textCardExpiry = null;
    target.textCvv = null;
    target.txtCardSecure = null;
    target.toolbar = null;
  }
}
