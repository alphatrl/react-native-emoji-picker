package com.rnemojipicker

import androidx.emoji2.emojipicker.EmojiPickerView
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

@ReactModule(name = RNEmojiPickerViewManager.NAME)
class RNEmojiPickerViewManager :
  EmojiPickerViewManagerSpec<EmojiPickerView>() {

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): EmojiPickerView {
    return EmojiPickerView(context)
  }

  @ReactProp(name = "emojiColumns")
  override fun setEmojiGridColumns(view: EmojiPickerView?, emojiGridColumns: Int) {
    view?.emojiGridColumns = emojiGridColumns
  }

  @ReactProp(name = "emojiRows")
  override fun setEmojiGridRows(view: EmojiPickerView?, emojiGridRows: Float) {
    view?.emojiGridRows = emojiGridRows
  }

  companion object {
    const val NAME = "EmojiPickerView"
  }
}
