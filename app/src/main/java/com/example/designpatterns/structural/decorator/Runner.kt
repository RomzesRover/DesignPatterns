package com.example.designpatterns.structural.decorator

import com.example.designpatterns.PushToLog

fun run(){
    var developer: Developer = JavaTeamLead(SeniorJavaDeveloper(JavaDeveloper()))
    PushToLog.l(developer.makeJob())
}