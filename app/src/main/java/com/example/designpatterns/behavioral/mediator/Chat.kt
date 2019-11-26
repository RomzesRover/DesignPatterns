package com.example.designpatterns.behavioral.mediator

interface Chat {
    fun sendMessage(message: String, user: User)
}