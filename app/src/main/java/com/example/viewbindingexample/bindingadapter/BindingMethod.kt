package com.example.viewbindingexample.bindingadapter

import android.widget.ImageView
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods

@BindingMethods(value = [BindingMethod(type = ImageView::class, attribute = "android:tomato", method = "setBackgroundColor")])
class BindingMethod {}