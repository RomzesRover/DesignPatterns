package com.example.designpatterns.creational.abstractFactory.banking

import android.content.Context
import android.widget.Toast
import com.example.designpatterns.creational.abstractFactory.Manager

class BankingPM: Manager {
    override fun manageProject(context: Context) {
        Toast.makeText(context, "Project manager manage project", Toast.LENGTH_LONG).show()
    }
}