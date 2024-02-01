package com.rnemojipicker

import android.content.Context
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import androidx.emoji2.emojipicker.EmojiPickerView
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.PixelUtil
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.yoga.YogaMeasureMode
import com.facebook.yoga.YogaMeasureOutput

@ReactModule(name = RNEmojiPickerViewManager.NAME)
class RNEmojiPickerViewManager : EmojiPickerViewManagerSpec<RNEmojiPickerContainerView>() {

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): RNEmojiPickerContainerView {
    val mEmojiPickerView = EmojiPickerView(context)
    mEmojiPickerView.layoutParams = LayoutParams(
      LayoutParams.MATCH_PARENT,
      LayoutParams.MATCH_PARENT
    )

    Log.d("createViewInstance", "created")
    return RNEmojiPickerContainerView(context, mEmojiPickerView)
  }


  @ReactProp(name = "emojiColumns", defaultInt = 0)
  override fun setEmojiGridColumns(view: RNEmojiPickerContainerView, emojiGridColumns: Int) {
    Log.d("emojiColumns", emojiGridColumns.toString())
    view.mEmojiPickerView.emojiGridColumns = emojiGridColumns
  }


  @ReactProp(name = "emojiRows", defaultFloat = -1F)
  override fun setEmojiGridRows(view: RNEmojiPickerContainerView, emojiGridRows: Float) {
    Log.d("emojiRows", emojiGridRows.toString())
    view.mEmojiPickerView.emojiGridRows = emojiGridRows
  }

  companion object {
    const val NAME = "EmojiPickerView"
  }
}
