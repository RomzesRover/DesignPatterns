package com.example.designpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.designpatterns.creational.abstractFactory.auctionSiteProject
import com.example.designpatterns.creational.abstractFactory.superBankSystem
import com.example.designpatterns.creational.factory.*
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
        ProgramLogger.addStringToLogger("Here we go")
        ProgramLogger.showLog(this)
    }
}
