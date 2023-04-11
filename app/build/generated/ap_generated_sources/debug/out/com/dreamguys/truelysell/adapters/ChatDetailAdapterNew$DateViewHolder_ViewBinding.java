// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.adapters;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatDetailAdapterNew$DateViewHolder_ViewBinding implements Unbinder {
  private ChatDetailAdapterNew.DateViewHolder target;

  @UiThread
  public ChatDetailAdapterNew$DateViewHolder_ViewBinding(ChatDetailAdapterNew.DateViewHolder target,
      View source) {
    this.target = target;

    target.tvChatDate = Utils.findRequiredViewAsType(source, R.id.tv_chat_date, "field 'tvChatDate'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChatDetailAdapterNew.DateViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvChatDate = null;
  }
}
