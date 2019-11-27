package com.example.designpatterns.behavioral.strategy

import com.example.designpatterns.PushToLog

class Sleeping: ActivityC {
    override fun justDoIt() {
        PushToLog.l("Sleeping...")
    }
}