package com.example.designpatterns.creational.builder

abstract class WebsiteBuilder {
    lateinit var website: Website

    fun createWebsite(){
        website = Website()
    }

    abstract fun buildName()
    abstract fun buildCms()
    abstract fun buildPrice()
}