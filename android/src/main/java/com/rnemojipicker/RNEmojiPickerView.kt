package com.rnemojipicker

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.facebook.react.bridge.ReactContext


class RNEmojiPickerView: View  {

  constructor(context: ReactContext?) : super(context)
  constructor(context: ReactContext?, attrs: AttributeSet?) : super(context, attrs)
  constructor(context: ReactContext?, attrs: AttributeSet?, defStyleAttr: Int) : super(
    context,
    attrs,
    defStyleAttr
  )
}
