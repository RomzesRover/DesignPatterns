package com.example.designpatterns.creational.abstractFactory.banking

import android.content.Context
import android.widget.Toast
import com.example.designpatterns.creational.abstractFactory.Developer

class JavaDeveloper: Developer {
    override fun writeCode(context: Context) {
        Toast.makeText(context, "Java Developer writes java code", Toast.LENGTH_LONG).show()
    }
}