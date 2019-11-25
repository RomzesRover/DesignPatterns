package com.example.designpatterns.structural.facade

import com.example.designpatterns.PushToLog

class Job {
    fun doJob(){
        PushToLog.l("Job in progress")
    }
}