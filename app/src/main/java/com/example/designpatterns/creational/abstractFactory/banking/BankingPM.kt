package com.example.designpatterns.creational.abstractFactory.banking

import com.example.designpatterns.PushToLog
import com.example.designpatterns.creational.abstractFactory.Manager

class BankingPM: Manager {
    override fun manageProject() {
        PushToLog.l("Project manager manage project")
    }
}