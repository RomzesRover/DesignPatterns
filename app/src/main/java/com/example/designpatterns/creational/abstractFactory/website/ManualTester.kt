package com.example.designpatterns.creational.abstractFactory.website

import android.content.Context
import android.widget.Toast
import com.example.designpatterns.creational.abstractFactory.Tester

class ManualTester: Tester {
    override fun testCode(context: Context) {
        Toast.makeText(context, "Manual tester tests site", Toast.LENGTH_LONG).show()
    }
}