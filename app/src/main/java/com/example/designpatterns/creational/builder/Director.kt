package com.example.designpatterns.creational.builder

class Director {
    lateinit var builder: WebsiteBuilder

    fun buildWebsite(): Website{
        builder.createWebsite()
        builder.buildCms()
        builder.buildName()
        builder.buildPrice()

        return builder.website
    }
}