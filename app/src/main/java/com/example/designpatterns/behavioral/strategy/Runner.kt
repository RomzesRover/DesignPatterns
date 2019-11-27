package com.example.designpatterns.behavioral.strategy

fun run(){
    var developer = Developer(Sleeping())
    developer.justDoIt()

    developer.activityC = Training()
    developer.justDoIt()

    developer.activityC = Reading()
    developer.justDoIt()

    developer.activityC = Coding()
    developer.justDoIt()

    developer.activityC = Sleeping()
    developer.justDoIt()
}