package com.example.designpatterns.structural.facade

import com.example.designpatterns.PushToLog

class BugTracker {
    private var activeSprint = false

    fun isActiveSprint(): Boolean{
        return activeSprint
    }

    fun startSprint(){
        PushToLog.l("Sprint is active")
        activeSprint = true
    }

    fun finishSprint(){
        PushToLog.l("Sprint is not active")
        activeSprint = false
    }
}