package com.example.designpatterns.structural.facade

import com.example.designpatterns.PushToLog

class Developer {
    fun doJobBeforeDeadline(bugTracker: BugTracker){
        if (bugTracker.isActiveSprint())
            PushToLog.l("Developer is solving problems")
        else
            PushToLog.l("Developer reading habrhabr..")
    }
}