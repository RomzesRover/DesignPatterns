package com.example.designpatterns.behavioral.observer

class JavaDeveloperWebSite: Observed {

    private var vacancies = ArrayList<String>()
    private var subscribers = ArrayList<Observer>()

    fun addVacancy(vacancy: String){
        this.vacancies.add(vacancy)
        notifyObservers()
    }

    fun removeVacancy(vacancy: String){
        this.vacancies.remove(vacancy)
        notifyObservers()
    }

    override fun addObserver(observer: Observer) {
        this.subscribers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        this.subscribers.remove(observer)
    }

    override fun notifyObservers() {
        subscribers.forEach {
            it.handleEvent(this.vacancies)
        }
    }
}