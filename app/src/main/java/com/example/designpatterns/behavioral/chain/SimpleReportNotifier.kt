package com.example.designpatterns.behavioral.chain

import com.example.designpatterns.PushToLog

class SimpleReportNotifier(priority: Int): Notifier(priority) {
    override fun write(message: String) {
        PushToLog.l("Notifying using SIMPLE report: $message")
    }
}