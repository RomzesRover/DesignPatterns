package com.example.designpatterns.behavioral.observer

interface Observed {
    fun addObserver(observer: Observer)

    fun removeObserver(observer: Observer)

    fun notifyObservers()
}