package com.example.designpatterns.behavioral.observer

fun run(){
    var jobSite = JavaDeveloperWebSite()

    jobSite.addVacancy("First position")
    jobSite.addVacancy("Second position")

    var subscriber1 = Subscriber("Roman")
    var subscriber2 = Subscriber("Oleg")

    jobSite.addObserver(subscriber1)
    jobSite.addObserver(subscriber2)

    jobSite.addVacancy("Third position")

    jobSite.removeVacancy("First position")
}