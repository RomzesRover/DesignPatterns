package com.example.designpatterns.creational.abstractFactory.banking

import android.content.Context
import android.widget.Toast
import com.example.designpatterns.creational.abstractFactory.Tester

class QATester: Tester {
    override fun testCode(context: Context) {
        Toast.makeText(context, "QA tester tests code", Toast.LENGTH_LONG).show()
    }
}