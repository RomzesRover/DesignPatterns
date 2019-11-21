package com.example.designpatterns.creational.factory

import android.content.Context
import android.widget.Toast

class JavaDeveloper: Developer {
    override fun writeCode(context: Context) {
        Toast.makeText(context, "Java Developer writes java code", Toast.LENGTH_LONG).show()
    }
}