package com.example.designpatterns.behavioral.state

import com.example.designpatterns.PushToLog

class Reading: ActivityC {
    override fun justDoIt() {
        PushToLog.l("Reading book...")
    }
}