package com.example.viewbindingexample.test

import android.util.Log
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel : ViewModel() {

    var title = MutableLiveData<String>()
    var count = MutableLiveData<Int>()

    var editText: String = "tomato"
        get() {
            Log.d("giang.coi", "get editText")
            return field
        }
        set(value) {
            Log.d("giang.coi", "set editText $value")
            field = value
        }

    fun onClick() {
        title.value = "hello world !"
        count.value = (count.value ?: 0) + 1
    }

}