// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.wallet;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.BaseActivity_ViewBinding;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddWalletActivity_ViewBinding extends BaseActivity_ViewBinding {
  private AddWalletActivity target;

  @UiThread
  public AddWalletActivity_ViewBinding(AddWalletActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddWalletActivity_ViewBinding(AddWalletActivity target, View source) {
    super(target, source);

    this.target = target;

    target.titleWallet = Utils.findRequiredViewAsType(source, R.id.title_wallet, "field 'titleWallet'", TextView.class);
    target.tvGigsTitle = Utils.findRequiredViewAsType(source, R.id.tv_gigs_title, "field 'tvGigsTitle'", TextView.class);
    target.labelCurrentBalance = Utils.findRequiredViewAsType(source, R.id.label_current_balance, "field 'labelCurrentBalance'", TextView.class);
    target.txtAddCash = Utils.findRequiredViewAsType(source, R.id.txt_add_cash, "field 'txtAddCash'", TextView.class);
    target.txtMinimumAmountOf50 = Utils.findRequiredViewAsType(source, R.id.txt_minimum_amount_of_50, "field 'txtMinimumAmountOf50'", TextView.class);
    target.labelAddCard = Utils.findRequiredViewAsType(source, R.id.label_add_card, "field 'labelAddCard'", TextView.class);
    target.rbDebitCreditCards = Utils.findRequiredViewAsType(source, R.id.rb_debit_credit_cards, "field 'rbDebitCreditCards'", RadioButton.class);
    target.textCardExpiry = Utils.findRequiredViewAsType(source, R.id.text_card_expiry, "field 'textCardExpiry'", TextView.class);
    target.textCvv = Utils.findRequiredViewAsType(source, R.id.text_cvv, "field 'textCvv'", TextView.class);
    target.txtCardSecure = Utils.findRequiredViewAsType(source, R.id.txt_card_secure, "field 'txtCardSecure'", TextView.class);
    target.rgCardDetails = Utils.findRequiredViewAsType(source, R.id.rg_card_details, "field 'rgCardDetails'", RadioGroup.class);
  }

  @Override
  public void unbind() {
    AddWalletActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleWallet = null;
    target.tvGigsTitle = null;
    target.labelCurrentBalance = null;
    target.txtAddCash = null;
    target.txtMinimumAmountOf50 = null;
    target.labelAddCard = null;
    target.rbDebitCreditCards = null;
    target.textCardExpiry = null;
    target.textCvv = null;
    target.txtCardSecure = null;
    target.rgCardDetails = null;

    super.unbind();
  }
}
