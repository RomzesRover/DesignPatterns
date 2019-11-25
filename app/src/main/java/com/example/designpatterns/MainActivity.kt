package com.example.designpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.designpatterns.creational.abstractFactory.auctionSiteProject
import com.example.designpatterns.creational.abstractFactory.superBankSystem
import com.example.designpatterns.creational.builder.Director
import com.example.designpatterns.creational.builder.EnterpriseWebsiteBuilder
import com.example.designpatterns.creational.builder.VisitCardWebsiteBuilder
import com.example.designpatterns.creational.builder.Website
import com.example.designpatterns.creational.factory.*
import com.example.designpatterns.creational.prototype.Project
import com.example.designpatterns.creational.prototype.ProjectFactory
import com.example.designpatterns.creational.singleton.ProgramLogger
import com.example.designpatterns.structural.adapter.AdapterJavaToDatabase
import com.example.designpatterns.structural.adapter.Database

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Usage creational.factory
//        var developerFactory: DeveloperFactory = createDeveloperFactoryBySpecialty("java")
//        var developer = developerFactory.createDeveloper()
//        developer.writeCode()

        //Usage creational.abstractFactory
//        superBankSystem()

        //Usage creational.singleton
//        ProgramLogger.showLog()
//        ProgramLogger.addStringToLogger("Here we go")
//        ProgramLogger.showLog()

        //Usage creational.builder
//        var director = Director()
//        director.builder = VisitCardWebsiteBuilder()
//        var website: Website = director.buildWebsite()
//        PushToLog.l(website.toString())

        //Usage creational.prototype
//        var project = Project(1, "hehe", "123")
//        PushToLog.l(project.toString())
//        var projectFactory = ProjectFactory(project)
//        var projectCopy = projectFactory.cloneProject()
//        PushToLog.l(projectCopy.toString())

        //Usage structural.adapter
        var database: Database = AdapterJavaToDatabase()
        database.insert()
        database.update()
        database.select()
        database.remove()
    }
}
