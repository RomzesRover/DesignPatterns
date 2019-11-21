package com.example.designpatterns.creational.abstractFactory

import android.content.Context
import com.example.designpatterns.creational.abstractFactory.banking.BankingTeamFactory
import com.example.designpatterns.creational.abstractFactory.website.WebsiteTeamFactory

fun superBankSystem(context: Context){
    val projectTeamFactory = BankingTeamFactory()
    val developer = projectTeamFactory.getDeveloper()
    val tester = projectTeamFactory.getTester()
    val manager = projectTeamFactory.getManager()

    developer.writeCode(context)
    tester.testCode(context)
    manager.manageProject(context)
}

fun auctionSiteProject(context: Context){
    val projectTeamFactory = WebsiteTeamFactory()
    val developer = projectTeamFactory.getDeveloper()
    val tester = projectTeamFactory.getTester()
    val manager = projectTeamFactory.getManager()

    developer.writeCode(context)
    tester.testCode(context)
    manager.manageProject(context)
}