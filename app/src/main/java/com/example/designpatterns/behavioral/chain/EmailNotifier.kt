package com.example.designpatterns.behavioral.chain

import com.example.designpatterns.PushToLog

class EmailNotifier(priority: Int): Notifier(priority) {
    override fun write(message: String) {
        PushToLog.l("Notifying using EMAIL report: $message")
    }
}