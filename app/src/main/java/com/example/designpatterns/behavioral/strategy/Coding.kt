package com.example.designpatterns.behavioral.strategy

import com.example.designpatterns.PushToLog

class Coding: ActivityC {
    override fun justDoIt() {
        PushToLog.l("Writing code...")
    }
}