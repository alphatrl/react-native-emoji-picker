package com.rnemojipicker

import android.view.View
import com.facebook.react.uimanager.SimpleViewManager

abstract class EmojiPickerViewManagerSpec<T : View> : SimpleViewManager<T>() {

  abstract fun setEmojiGridColumns(view: T, emojiGridColumns: Int)

  abstract fun setEmojiGridRows(view: T, emojiGridRows: Float)
}
