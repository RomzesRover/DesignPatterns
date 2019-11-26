package com.example.designpatterns.behavioral.mediator

import com.example.designpatterns.PushToLog

class Admin(private var chat: Chat, var name: String): User {
    override fun sendMessage(message: String) {
        chat.sendMessage(message, this)
    }

    override fun getMessage(message: String) {
        PushToLog.l("${this.name} Receiving message: $message")
    }
}