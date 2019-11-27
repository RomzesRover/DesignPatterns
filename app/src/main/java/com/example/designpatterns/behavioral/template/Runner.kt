package com.example.designpatterns.behavioral.template

fun run(){
    var welcomePage = WelcomePage()
    var newsPage = NewsPage()

    welcomePage.showPage()
    newsPage.showPage()
}