package com.example.designpatterns.creational.prototype

import com.example.designpatterns.PushToLog

fun run(){
    var project = Project(1, "hehe", "123")
    PushToLog.l(project.toString())
    var projectFactory = ProjectFactory(project)
    var projectCopy = projectFactory.cloneProject()
    PushToLog.l(projectCopy.toString())
}