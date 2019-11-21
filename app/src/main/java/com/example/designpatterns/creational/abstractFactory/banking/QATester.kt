package com.example.designpatterns.creational.abstractFactory.banking

import com.example.designpatterns.PushToLog
import com.example.designpatterns.creational.abstractFactory.Tester

class QATester: Tester {
    override fun testCode() {
        PushToLog.l("QA tester tests code")
    }
}