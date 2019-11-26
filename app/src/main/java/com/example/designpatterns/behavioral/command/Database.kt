package com.example.designpatterns.behavioral.command

import com.example.designpatterns.PushToLog

class Database {
    fun insert(){
        PushToLog.l("Inserting record ... ")
    }

    fun update(){
        PushToLog.l("Updating record ... ")
    }

    fun select(){
        PushToLog.l("Reading record ... ")
    }

    fun remove(){
        PushToLog.l("deleting record ... ")
    }
}