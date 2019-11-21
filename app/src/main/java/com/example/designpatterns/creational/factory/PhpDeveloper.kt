package com.example.designpatterns.creational.factory

import android.content.Context
import android.widget.Toast

class PhpDeveloper: Developer {
    override fun writeCode(context: Context) {
        Toast.makeText(context, "Php Developer writes php code", Toast.LENGTH_LONG).show()
    }
}