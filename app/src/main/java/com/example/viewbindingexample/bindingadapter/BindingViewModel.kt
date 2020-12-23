package com.example.viewbindingexample.bindingadapter

import android.util.Log
import androidx.databinding.InverseMethod
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class BindingViewModel : ViewModel() {

    private val _title = MutableLiveData<String>()
    private val _count = MutableLiveData<Int>(0)
    private val _stats = MutableLiveData<Boolean>(false)

    val count2 = MutableLiveData<Int>(0)

    var title: MutableLiveData<String> = MutableLiveData<String>()
        get() {
            return field
        }
        set(value) {
            Log.d("TAG", ": set livedata : ")
            field = value
        }

    val count: LiveData<Int> get() = _count
    val status: LiveData<Boolean> get() = _stats

    fun onclick() {

//        Log.d("TAG", "onclick: data Click : "+ data)
        _title.value = "orange"
        _stats.value = true

        _count.value = (_count.value ?: 0) + 1
        count2.value = (count2.value ?: 0) + 1
    }

    init {
//        viewModelScope.launch {
//            while (true) {
//                delay(1000)
//                _title.value = "orange"
//                _count.value = (_count.value ?: 0) + 1
//            }
//        }
        _title.value = ""
    }

}