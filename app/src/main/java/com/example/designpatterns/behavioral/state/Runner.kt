package com.example.designpatterns.behavioral.state

fun run(){
    var developer = Developer(Sleeping())

    for (i in 0..10){
        developer.justDoIt()
        developer.changeActivity()
    }
}