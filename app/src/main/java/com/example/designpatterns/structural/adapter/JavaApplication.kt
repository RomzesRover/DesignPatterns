package com.example.designpatterns.structural.adapter

import com.example.designpatterns.PushToLog

open class JavaApplication {
    fun saveObject(){
        PushToLog.l("Save an object..")
    }

    fun updateObject(){
        PushToLog.l("UPdate an object..")
    }

    fun loadObject(){
        PushToLog.l("load an object..")
    }

    fun removeObject(){
        PushToLog.l("remove an object..")
    }


}