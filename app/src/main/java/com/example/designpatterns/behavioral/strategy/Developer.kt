package com.example.designpatterns.behavioral.strategy

class Developer(var activityC: ActivityC) {
    fun justDoIt(){
        this.activityC.justDoIt()
    }
}