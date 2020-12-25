package com.example.viewbindingexample.test

import android.graphics.Color
import android.util.Log
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.viewbindingexample.R

/*

B1: Read XML :
mycolor = null
count2ee = null

read in View

B2: Call static method setColor(view, oldmycolor, mycolor, oldcount2ee, count2ee)

B3:
oldmycolor = mycolor
oldcount2ee = count2ee
*/

@BindingAdapter(value = ["mycolor", "count2ee"], requireAll = false)
fun TextView.setColor(oldCount: Int?,
                      oldCount2: String?,
                      count: Int?,
                      count2: String?) {
    Log.d("giang.coi","oldCount = $oldCount, count = $count, oldCount2 = $oldCount, count2 = $count")
    //setTextColor(count)
}

@BindingAdapter("mycolor2", "count2")
fun setColor2(textview: TextView, count: Int, count2: Int) {
//    if (count > 3) {
    Log.d("TAG", "setColor2: count 1" + count)
    Log.d("TAG", "setColor2: count 2" + count2)
    textview.setTextColor(Color.YELLOW)
    textview.setText("aloha : count ${count}}")
//    } else {
//        textview.setTextColor(Color.BLUE)
//    }
}