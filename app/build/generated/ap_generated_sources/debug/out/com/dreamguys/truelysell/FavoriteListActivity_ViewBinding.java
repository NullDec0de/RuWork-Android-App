// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FavoriteListActivity_ViewBinding extends BaseActivity_ViewBinding {
  private FavoriteListActivity target;

  @UiThread
  public FavoriteListActivity_ViewBinding(FavoriteListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FavoriteListActivity_ViewBinding(FavoriteListActivity target, View source) {
    super(target, source);

    this.target = target;

    target.favRecycler = Utils.findRequiredViewAsType(source, R.id.favRecycler, "field 'favRecycler'", RecyclerView.class);
    target.tvNoData = Utils.findRequiredViewAsType(source, R.id.tv_no_data, "field 'tvNoData'", TextView.class);
    target.refreshFav = Utils.findRequiredViewAsType(source, R.id.refreshFav, "field 'refreshFav'", SwipeRefreshLayout.class);
  }

  @Override
  public void unbind() {
    FavoriteListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.favRecycler = null;
    target.tvNoData = null;
    target.refreshFav = null;

    super.unbind();
  }
}
