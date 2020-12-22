package com.example.viewbindingexample.bindingadapter

import android.graphics.Color
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.example.viewbindingexample.R

object BindingAdapter {

    @BindingAdapter("textColor")
    @JvmStatic
    fun setColor(view: TextView, count: Int) {
        if (count > 5) {
            view.setTextColor(Color.RED)
        } else {
            view.setTextColor(Color.BLACK)
        }
    }

    @BindingAdapter("textData", "count")
    @JvmStatic
    fun formatText(view TextView, textData: String, count: Int) {

    }

    @BindingAdapter("viewLog")
    @JvmStatic
    fun viewLog(textView: TextView, count: Int) {
        Log.d("TAG", "viewLog: ${count}")
    }
}