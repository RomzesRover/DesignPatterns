package com.example.designpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Usage creational.factory
//        var developerFactory: DeveloperFactory = createDeveloperFactoryBySpecialty("php")
//        var developer = developerFactory.createDeveloper()
//        developer.writeCode(this)

        //Usage creational.abstractFactory
//        auctionSiteProject(this)

        //Usage creational.singleton
//        ProgramLogger.addStringToLogger("Here we go")
//        ProgramLogger.showLog(this)

        //Usage creational.builder
//        var director = Director()
//        director.builder = EnterpriseWebsiteBuilder()
//        var website: Website = director.buildWebsite()
//        Toast.makeText(this, website.toString(), Toast.LENGTH_LONG).show()

        //Usage creational.prototype
        var project = Project(1, "hehe", "123")
        var projectFactory = ProjectFactory(project)
        var projectCopy = projectFactory.cloneProject()
        Toast.makeText(this, projectCopy.toString(), Toast.LENGTH_LONG).show()
    }
}
