// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CreateServiceInfoFragment_ViewBinding implements Unbinder {
  private CreateServiceInfoFragment target;

  private View view7f08011b;

  private View view7f0801d0;

  private View view7f0801e7;

  private View view7f08028f;

  @UiThread
  public CreateServiceInfoFragment_ViewBinding(final CreateServiceInfoFragment target,
      View source) {
    this.target = target;

    View view;
    target.etTitle = Utils.findRequiredViewAsType(source, R.id.et_title, "field 'etTitle'", EditText.class);
    target.llDescParent = Utils.findRequiredViewAsType(source, R.id.ll_desc_parent, "field 'llDescParent'", LinearLayout.class);
    target.etLocation = Utils.findRequiredViewAsType(source, R.id.et_location, "field 'etLocation'", EditText.class);
    target.etContactNo = Utils.findRequiredViewAsType(source, R.id.et_contact_no, "field 'etContactNo'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_provider_next, "field 'btnProviderNext' and method 'onViewClicked'");
    target.btnProviderNext = Utils.castView(view, R.id.btn_provider_next, "field 'btnProviderNext'", Button.class);
    view7f08011b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.et_category, "field 'etCategory' and method 'onViewClicked'");
    target.etCategory = Utils.castView(view, R.id.et_category, "field 'etCategory'", EditText.class);
    view7f0801d0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.et_subcategory, "field 'etSubcategory' and method 'onViewClicked'");
    target.etSubcategory = Utils.castView(view, R.id.et_subcategory, "field 'etSubcategory'", EditText.class);
    view7f0801e7 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.etCost = Utils.findRequiredViewAsType(source, R.id.et_cost, "field 'etCost'", EditText.class);
    target.etAbout = Utils.findRequiredViewAsType(source, R.id.et_about, "field 'etAbout'", EditText.class);
    target.ivProviderImg = Utils.findRequiredViewAsType(source, R.id.iv_provider_img, "field 'ivProviderImg'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.iv_upload, "field 'ivUpload' and method 'onViewClicked'");
    target.ivUpload = Utils.castView(view, R.id.iv_upload, "field 'ivUpload'", ImageView.class);
    view7f08028f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.txtUpload = Utils.findRequiredViewAsType(source, R.id.txt_upload, "field 'txtUpload'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CreateServiceInfoFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etTitle = null;
    target.llDescParent = null;
    target.etLocation = null;
    target.etContactNo = null;
    target.btnProviderNext = null;
    target.etCategory = null;
    target.etSubcategory = null;
    target.etCost = null;
    target.etAbout = null;
    target.ivProviderImg = null;
    target.ivUpload = null;
    target.txtUpload = null;

    view7f08011b.setOnClickListener(null);
    view7f08011b = null;
    view7f0801d0.setOnClickListener(null);
    view7f0801d0 = null;
    view7f0801e7.setOnClickListener(null);
    view7f0801e7 = null;
    view7f08028f.setOnClickListener(null);
    view7f08028f = null;
  }
}
