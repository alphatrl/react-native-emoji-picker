package com.rnemojipicker

import android.util.Log
import androidx.emoji2.emojipicker.EmojiPickerView
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

@ReactModule(name = RNEmojiPickerViewManager.NAME)
class RNEmojiPickerViewManager : EmojiPickerViewManagerSpec<EmojiPickerView>() {

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): EmojiPickerView {
    return EmojiPickerView(context)
  }

  @ReactProp(name = "emojiColumns", defaultInt = 0)
  override fun setEmojiGridColumns(view: EmojiPickerView, emojiGridColumns: Int) {
    Log.d("emojiColumns", emojiGridColumns.toString())
    view.emojiGridColumns = emojiGridColumns
  }


  @ReactProp(name = "emojiRows", defaultFloat = 0f)
  override fun setEmojiGridRows(view: EmojiPickerView, emojiGridRows: Float) {
    Log.d("emojiRows", emojiGridRows.toString())
    view.emojiGridRows = emojiGridRows
  }

  companion object {
    const val NAME = "EmojiPickerView"
  }
}
