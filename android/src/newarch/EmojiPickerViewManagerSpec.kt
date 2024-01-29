package com.emojipicker

import android.view.View

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.viewmanagers.EmojiPickerViewManagerDelegate
import com.facebook.react.viewmanagers.EmojiPickerViewManagerInterface

abstract class EmojiPickerViewManagerSpec<T : View> : SimpleViewManager<T>(), EmojiPickerViewManagerInterface<T> {
  private val mDelegate: ViewManagerDelegate<T>

  init {
    mDelegate = EmojiPickerViewManagerDelegate(this)
  }

  override fun getDelegate(): ViewManagerDelegate<T>? {
    return mDelegate
  }
}
