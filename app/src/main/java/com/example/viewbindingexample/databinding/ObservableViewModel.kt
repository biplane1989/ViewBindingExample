package com.example.viewbindingexample.databinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ObservableViewModel : ViewModel() {
    var count = ObservableInt()
    val myObservable = MyObservable()

    fun onClick() {
        myObservable.setTitle("Orange")
        count.set(count.get() + 1)
    }

//    init {
//        viewModelScope.launch {
//            while (true) {
//                delay(1000)
//                myObservable.setTitle("Orange")
//                count.set(count.get() + 1)
//            }
//        }
//    }
}