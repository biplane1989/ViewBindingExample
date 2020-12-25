package com.example.viewbindingexample.test

import android.widget.ImageView
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods

@BindingMethods(value = [BindingMethod(type = ImageView::class, attribute = "android:test", method = "setBackgroundColor")])
class BindingMethodTest {}