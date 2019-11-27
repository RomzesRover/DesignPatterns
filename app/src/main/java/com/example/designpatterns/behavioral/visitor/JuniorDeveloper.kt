package com.example.designpatterns.behavioral.visitor

import com.example.designpatterns.PushToLog

class JuniorDeveloper: Developer {
    override fun create(projectClass: ProjectClass) {
        PushToLog.l("Write poor class")
    }

    override fun create(projectDatabase: ProjectDatabase) {
        PushToLog.l("Drop database")
    }

    override fun create(projectTest: ProjectTest) {
        PushToLog.l("Create not reliable test")
    }
}