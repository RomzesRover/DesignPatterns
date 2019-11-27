package com.example.designpatterns.behavioral.template

import com.example.designpatterns.PushToLog

class NewsPage: WebsiteTemplate() {
    override fun showContent() {
        PushToLog.l("News")
    }
}