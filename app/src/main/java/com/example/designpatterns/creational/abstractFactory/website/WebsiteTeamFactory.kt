package com.example.designpatterns.creational.abstractFactory.website

import com.example.designpatterns.creational.abstractFactory.Developer
import com.example.designpatterns.creational.abstractFactory.Manager
import com.example.designpatterns.creational.abstractFactory.ProjectTeamFactory
import com.example.designpatterns.creational.abstractFactory.Tester

class WebsiteTeamFactory: ProjectTeamFactory {
    override fun getDeveloper(): Developer {
        return PhpDeveloper()
    }

    override fun getTester(): Tester {
        return ManualTester()
    }

    override fun getManager(): Manager {
        return WebSitePm()
    }
}