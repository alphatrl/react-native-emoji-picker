package com.rnemojipicker

import android.view.View
import androidx.emoji2.emojipicker.EmojiPickerView
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.SimpleViewManager

abstract class EmojiPickerViewManagerSpec<T : EmojiPickerView> : SimpleViewManager<T>() {
  abstract fun setEmojiGridColumns(view: T?, emojiGridColumns: Int)

  abstract fun setEmojiGridRows(view: T?, emojiGridRows: Float)
}
