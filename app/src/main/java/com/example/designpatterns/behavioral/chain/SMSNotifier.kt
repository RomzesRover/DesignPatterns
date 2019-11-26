package com.example.designpatterns.behavioral.chain

import com.example.designpatterns.PushToLog

class SMSNotifier(priority: Int) : Notifier(priority) {
    override fun write(message: String) {
        PushToLog.l("Notifying using SMS report: $message")
    }
}