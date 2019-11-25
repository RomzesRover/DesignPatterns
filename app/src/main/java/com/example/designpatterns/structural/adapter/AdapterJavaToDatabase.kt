package com.example.designpatterns.structural.adapter

class AdapterJavaToDatabase: JavaApplication(), Database {
    override fun insert() {
        saveObject()
    }

    override fun update() {
        updateObject()
    }

    override fun select() {
        loadObject()
    }

    override fun remove() {
        removeObject()
    }
}