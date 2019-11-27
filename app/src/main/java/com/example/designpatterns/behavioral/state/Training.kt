package com.example.designpatterns.behavioral.state

import com.example.designpatterns.PushToLog

class Training: ActivityC {
    override fun justDoIt() {
        PushToLog.l("Training...")
    }
}