package com.example.viewbindingexample.bindingadapter

import android.view.View

object Utils {

    @JvmStatic fun booleanToVisibility(isNotVisible: Boolean): Int {
        return if (!isNotVisible) View.GONE else View.VISIBLE
    }
}