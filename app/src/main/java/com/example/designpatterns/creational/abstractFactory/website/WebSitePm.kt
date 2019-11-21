package com.example.designpatterns.creational.abstractFactory.website

import android.content.Context
import android.widget.Toast
import com.example.designpatterns.creational.abstractFactory.Manager

class WebSitePm: Manager {
    override fun manageProject(context: Context) {
        Toast.makeText(context, "Web site pm manage project", Toast.LENGTH_LONG).show()
    }
}