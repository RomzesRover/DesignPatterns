package com.example.designpatterns.behavioral.template

import com.example.designpatterns.PushToLog

class WelcomePage: WebsiteTemplate() {
    override fun showContent() {
        PushToLog.l("Welcome")
    }
}