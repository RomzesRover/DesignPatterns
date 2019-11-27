package com.example.designpatterns.behavioral.state

import com.example.designpatterns.PushToLog

class Coding: ActivityC {
    override fun justDoIt() {
        PushToLog.l("Writing code...")
    }
}