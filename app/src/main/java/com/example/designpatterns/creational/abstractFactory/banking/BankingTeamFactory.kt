package com.example.designpatterns.creational.abstractFactory.banking

import com.example.designpatterns.creational.abstractFactory.Developer
import com.example.designpatterns.creational.abstractFactory.Manager
import com.example.designpatterns.creational.abstractFactory.ProjectTeamFactory
import com.example.designpatterns.creational.abstractFactory.Tester

class BankingTeamFactory: ProjectTeamFactory {
    override fun getDeveloper(): Developer {
        return JavaDeveloper()
    }

    override fun getTester(): Tester {
        return QATester()
    }

    override fun getManager(): Manager {
        return BankingPM()
    }
}