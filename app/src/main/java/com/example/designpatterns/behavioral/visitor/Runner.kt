package com.example.designpatterns.behavioral.visitor

import com.example.designpatterns.PushToLog

fun run(){
    var project = Project()

    var juniorDeveloper = JuniorDeveloper()
    var seniorDeveloper = SeniorDeveloper()

    PushToLog.l("Jun in action!")
    project.beWritten(juniorDeveloper)

    PushToLog.l("Senior in action!")
    project.beWritten(seniorDeveloper)


}