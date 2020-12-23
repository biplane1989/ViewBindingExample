package com.example.viewbindingexample.databinding

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.viewbindingexample.BR

class MyObservable() : BaseObservable() {
    private var _title: String = ""

    @Bindable
    fun getTitle(): String {
        return this._title
    }

    fun setTitle(data: String) {
        // preprocess data
        this._title = data
        if (data.equals("abc")) {
            this._title = "new abc"
        }
        notifyPropertyChanged(BR.title)
        Log.d("TAG", "setTitle: tow way binding")
    }
}


