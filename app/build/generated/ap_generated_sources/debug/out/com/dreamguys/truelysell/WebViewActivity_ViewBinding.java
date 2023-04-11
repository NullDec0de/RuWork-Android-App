// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.webkit.WebView;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WebViewActivity_ViewBinding extends BaseActivity_ViewBinding {
  private WebViewActivity target;

  @UiThread
  public WebViewActivity_ViewBinding(WebViewActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WebViewActivity_ViewBinding(WebViewActivity target, View source) {
    super(target, source);

    this.target = target;

    target.webview = Utils.findRequiredViewAsType(source, R.id.webview, "field 'webview'", WebView.class);
  }

  @Override
  public void unbind() {
    WebViewActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.webview = null;

    super.unbind();
  }
}
