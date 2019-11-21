package com.example.designpatterns

import android.util.Log

object PushToLog {
    fun l(message: String){
        Log.e("CATCH", "------------------------!!!------------------------")
        Log.e("CATCH", message)
        Log.e("CATCH", "------------------------!!!------------------------")
    }
}