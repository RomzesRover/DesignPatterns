package com.example.designpatterns.behavioral.visitor

import com.example.designpatterns.PushToLog

class SeniorDeveloper: Developer {
    override fun create(projectClass: ProjectClass) {
        PushToLog.l("Rewrite code after jun")
    }

    override fun create(projectDatabase: ProjectDatabase) {
        PushToLog.l("Fix database")
    }

    override fun create(projectTest: ProjectTest) {
        PushToLog.l("Create reliable test")
    }
}