package com.example.designpatterns.behavioral.chain

abstract class Notifier(private var priority: Int) {
    private lateinit var nextNotifier: Notifier

    fun setNextNotifier(nextNotifier: Notifier){
        this.nextNotifier = nextNotifier
    }

    fun notifyManager(message: String, level: Int){
        if (level >= priority){
            write(message)
        }
        if (::nextNotifier.isInitialized){
            nextNotifier.notifyManager(message, level)
        }
    }

    abstract fun write(message: String)
}