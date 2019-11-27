package com.example.designpatterns.behavioral.observer

import com.example.designpatterns.PushToLog

class Subscriber(private var name: String): Observer {
    override fun handleEvent(vacancies: List<String>) {
        PushToLog.l("Dear $name We have some changes in vacancies list\n$vacancies")
    }
}