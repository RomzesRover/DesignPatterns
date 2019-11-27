package com.example.designpatterns.behavioral.observer

interface Observer {
    fun handleEvent(vacancies: List<String>)
}