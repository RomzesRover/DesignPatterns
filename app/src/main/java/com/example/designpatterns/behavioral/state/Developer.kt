package com.example.designpatterns.behavioral.state

class Developer(private var activityC: ActivityC) {
    fun changeActivity(){
        activityC = when(activityC){
            is Sleeping -> Training()
            is Training -> Coding()
            is Coding -> Reading()
            else -> Sleeping()
        }
    }

    fun justDoIt(){
        this.activityC.justDoIt()
    }
}