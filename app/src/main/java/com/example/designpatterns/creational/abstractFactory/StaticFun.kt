package com.example.designpatterns.creational.abstractFactory

import com.example.designpatterns.creational.abstractFactory.banking.BankingTeamFactory
import com.example.designpatterns.creational.abstractFactory.website.WebsiteTeamFactory

fun superBankSystem(){
    val projectTeamFactory = BankingTeamFactory()
    val developer = projectTeamFactory.getDeveloper()
    val tester = projectTeamFactory.getTester()
    val manager = projectTeamFactory.getManager()

    developer.writeCode()
    tester.testCode()
    manager.manageProject()
}

fun auctionSiteProject(){
    val projectTeamFactory = WebsiteTeamFactory()
    val developer = projectTeamFactory.getDeveloper()
    val tester = projectTeamFactory.getTester()
    val manager = projectTeamFactory.getManager()

    developer.writeCode()
    tester.testCode()
    manager.manageProject()
}