package com.example.designpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.designpatterns.creational.factory.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Usage creational.factory.Developer
        var developerFactory: DeveloperFactory = createDeveloperFactoryBySpecialty("php")
        var developer = developerFactory.createDeveloper()
        developer.writeCode(this)
    }
}
