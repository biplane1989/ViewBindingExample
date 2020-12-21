package com.example.viewbindingexample.databinding

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.databinding.ObservableParcelable

data class ObservableData(val title: ObservableField<String>, val count: ObservableInt){

}