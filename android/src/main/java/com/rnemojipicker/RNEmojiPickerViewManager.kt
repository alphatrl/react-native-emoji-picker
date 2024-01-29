package com.rnemojipicker

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

@ReactModule(name = RNEmojiPickerViewManager.NAME)
class RNEmojiPickerViewManager :
  EmojiPickerViewManagerSpec<RNEmojiPickerView>() {
  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): RNEmojiPickerView {
    return RNEmojiPickerView(context)
  }

  @ReactProp(name = "color")
  override fun setColor(view: RNEmojiPickerView?, color: String?) {
    view?.setBackgroundColor(Color.parseColor(color))
  }

  companion object {
    const val NAME = "EmojiPickerView"
  }
}
