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
    return RNEmojiPickerContainerView(context)
  }

  @ReactProp(name = "emojiColumns", defaultInt = 0)
  override fun setEmojiGridColumns(view: RNEmojiPickerContainerView, emojiGridColumns: Int) {
    Log.d("emojiColumns", emojiGridColumns.toString())
    view.setEmojiGridColumns(emojiGridColumns)
  }


  @ReactProp(name = "emojiRows", defaultFloat = -1F)
  override fun setEmojiGridRows(view: RNEmojiPickerContainerView, emojiGridRows: Float) {
    Log.d("emojiRows", emojiGridRows.toString())
    view.setEmojiGridRows(emojiGridRows)
  }

  override fun onAfterUpdateTransaction(view: RNEmojiPickerContainerView) {
    view.apply()
  }

  override fun measure(
    context: Context,
    localData: ReadableMap,
    props: ReadableMap,
    state: ReadableMap,
    width: Float,
    widthMode: YogaMeasureMode,
    height: Float,
    heightMode: YogaMeasureMode,
    attachmentsPositions: FloatArray?): Long {

    val emojiPicker = EmojiPickerView(context)
    val measureSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
    emojiPicker.measure(measureSpec, measureSpec)
    val value = Pair(emojiPicker.measuredWidth, emojiPicker.measuredHeight);


    return YogaMeasureOutput.make(
      PixelUtil.toDIPFromPixel(value.first.toFloat()),
      PixelUtil.toDIPFromPixel(value.second.toFloat())
    )
  }

  companion object {
    const val NAME = "EmojiPickerView"
  }
}
