package com.example.designpatterns.creational.builder

import com.example.designpatterns.PushToLog

fun run(){
    var director = Director()
    director.builder = VisitCardWebsiteBuilder()
    var website: Website = director.buildWebsite()
    PushToLog.l(website.toString())
}