package com.emojipicker

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

@ReactModule(name = EmojiPickerViewManager.NAME)
class EmojiPickerViewManager :
  EmojiPickerViewManagerSpec<EmojiPickerView>() {
  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): EmojiPickerView {
    return EmojiPickerView(context)
  }

  @ReactProp(name = "color")
  override fun setColor(view: EmojiPickerView?, color: String?) {
    view?.setBackgroundColor(Color.parseColor(color))
  }

  companion object {
    const val NAME = "EmojiPickerView"
  }
}
