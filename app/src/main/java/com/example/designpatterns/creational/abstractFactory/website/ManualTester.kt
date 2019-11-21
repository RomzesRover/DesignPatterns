package com.example.designpatterns.creational.abstractFactory.website

import com.example.designpatterns.PushToLog
import com.example.designpatterns.creational.abstractFactory.Tester

class ManualTester: Tester {
    override fun testCode() {
        PushToLog.l("Manual tester tests site")
    }
}