// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.Button;
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

public class EditServiceImagesFragment_ViewBinding implements Unbinder {
  private EditServiceImagesFragment target;

  private View view7f08011b;

  private View view7f080498;

  @UiThread
  public EditServiceImagesFragment_ViewBinding(final EditServiceImagesFragment target,
      View source) {
    this.target = target;

    View view;
    target.ivServiceImage = Utils.findRequiredViewAsType(source, R.id.iv_service_image, "field 'ivServiceImage'", ImageView.class);
    target.llServiceImages = Utils.findRequiredViewAsType(source, R.id.ll_service_images, "field 'llServiceImages'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.btn_provider_next, "field 'btnProviderNext' and method 'onViewClicked'");
    target.btnProviderNext = Utils.castView(view, R.id.btn_provider_next, "field 'btnProviderNext'", Button.class);
    view7f08011b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_browse_gallery, "field 'tvBrowseGallery' and method 'onViewClicked'");
    target.tvBrowseGallery = Utils.castView(view, R.id.tv_browse_gallery, "field 'tvBrowseGallery'", TextView.class);
    view7f080498 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    EditServiceImagesFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivServiceImage = null;
    target.llServiceImages = null;
    target.btnProviderNext = null;
    target.tvBrowseGallery = null;

    view7f08011b.setOnClickListener(null);
    view7f08011b = null;
    view7f080498.setOnClickListener(null);
    view7f080498 = null;
  }
}
