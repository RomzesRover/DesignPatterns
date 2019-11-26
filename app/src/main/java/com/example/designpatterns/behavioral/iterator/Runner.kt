package com.example.designpatterns.behavioral.iterator

import com.example.designpatterns.PushToLog

fun run(){
    var skills = arrayOf("Java", "Spring", "Maven", "Hibernate")
    var developer = JavaDeveloper("Roman G", skills)
    var iterator = developer.getIterator()
    PushToLog.l("Developer ${developer.name}")
    PushToLog.l("Skills: ")
    while (iterator.hasNext()){
        PushToLog.l("${iterator.next()} ")
    }
}