package com.example.designpatterns.creational.abstractFactory.website

import android.content.Context
import android.widget.Toast
import com.example.designpatterns.creational.abstractFactory.Developer

class PhpDeveloper: Developer {
    override fun writeCode(context: Context) {
        Toast.makeText(context, "Php developer writes php code", Toast.LENGTH_LONG).show()
    }
}