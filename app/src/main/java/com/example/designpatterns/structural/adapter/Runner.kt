package com.example.designpatterns.structural.adapter

fun run(){
    var database: Database = AdapterJavaToDatabase()
    database.insert()
    database.update()
    database.select()
    database.remove()

}