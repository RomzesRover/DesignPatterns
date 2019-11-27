package com.example.designpatterns.behavioral.template

import com.example.designpatterns.PushToLog

abstract class WebsiteTemplate {
    fun showPage(){
        PushToLog.l("Header")
        showContent()
        PushToLog.l("Footer")
    }

    abstract fun showContent()
}