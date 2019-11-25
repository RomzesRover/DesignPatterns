package com.example.designpatterns.structural.adapter

interface Database {
    fun insert()

    fun update()

    fun select()

    fun remove()
}