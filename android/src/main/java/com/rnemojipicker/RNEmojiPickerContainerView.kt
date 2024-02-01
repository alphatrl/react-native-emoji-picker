package com.rnemojipicker

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.emoji2.emojipicker.EmojiPickerView
import com.facebook.react.bridge.JSApplicationIllegalArgumentException

class RNEmojiPickerContainerView(context: Context, emojiPickerView: EmojiPickerView) : FrameLayout(context) {
//  private var mEmojiGridColumns: Int = 0
//  private var mEmojiGridRows: Float = 0f

  init {
    addView(emojiPickerView)
  }

  val mEmojiPickerView = getChildAt(0) as EmojiPickerView

//  fun setEmojiGridColumns(emojiGridColumns: Int) {
//    mEmojiPickerView.emojiGridColumns = emojiGridColumns
//  }
//
//  fun setEmojiGridRows(emojiGridRows: Float) {
//    mEmojiPickerView.emojiGridRows = emojiGridRows
//  }

  companion object {
    /**
     * A helper to get react tag id by given WebView
     */
    @JvmStatic
    fun getReactTagFromWebView(emojiPickerView: EmojiPickerView): Int {
      // It is expected that the webView is enclosed by [RNCWebViewWrapper] as the first child.
      // Therefore, it must have a parent, and the parent ID is the reactTag.
      // In exceptional cases, such as receiving WebView messaging after the view has been unmounted,
      // the WebView will not have a parent.
      // In this case, we simply return -1 to indicate that it was not found.
      return (emojiPickerView.parent as? View)?.id ?: -1
    }
  }


}
