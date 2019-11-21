package com.example.designpatterns.creational.abstractFactory.website

import com.example.designpatterns.PushToLog
import com.example.designpatterns.creational.abstractFactory.Manager

class WebSitePm: Manager {
    override fun manageProject() {
        PushToLog.l("Web site pm manage project")
    }
}