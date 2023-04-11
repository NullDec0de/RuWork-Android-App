// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.adapters;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DialogEditCategoryListAdapter$CategoryViewHolder_ViewBinding implements Unbinder {
  private DialogEditCategoryListAdapter.CategoryViewHolder target;

  @UiThread
  public DialogEditCategoryListAdapter$CategoryViewHolder_ViewBinding(
      DialogEditCategoryListAdapter.CategoryViewHolder target, View source) {
    this.target = target;

    target.ivCatImg = Utils.findRequiredViewAsType(source, R.id.iv_cat_img, "field 'ivCatImg'", ImageView.class);
    target.tvCatName = Utils.findRequiredViewAsType(source, R.id.tv_cat_name, "field 'tvCatName'", CheckBox.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DialogEditCategoryListAdapter.CategoryViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivCatImg = null;
    target.tvCatName = null;
  }
}
