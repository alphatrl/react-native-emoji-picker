package com.rnemojipicker

import android.content.Context
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.emoji2.emojipicker.EmojiPickerView
import com.facebook.react.bridge.JSApplicationIllegalArgumentException

class RNEmojiPickerContainerView(context: Context) : FrameLayout(context) {
  private var mEmojiPickerView: EmojiPickerView = EmojiPickerView(context)
  private var mEmojiGridColumns: Int = 0
  private var mEmojiGridRows: Float = 0f

  fun setEmojiGridColumns(emojiGridColumns: Int) {
    mEmojiGridColumns = emojiGridColumns
  }

  fun setEmojiGridRows(emojiGridRows: Float) {
    mEmojiGridRows = emojiGridRows
  }

  fun apply() {
    mEmojiPickerView.emojiGridRows = mEmojiGridRows
    mEmojiPickerView.emojiGridColumns = mEmojiGridColumns
  }

}
