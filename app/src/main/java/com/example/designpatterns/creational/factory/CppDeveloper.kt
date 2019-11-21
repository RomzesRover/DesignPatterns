package com.example.designpatterns.creational.factory

import android.content.Context
import android.widget.Toast

class CppDeveloper: Developer {
    override fun writeCode(context: Context) {
       Toast.makeText(context, "Cpp developer writes cpp code", Toast.LENGTH_LONG).show()
    }
}