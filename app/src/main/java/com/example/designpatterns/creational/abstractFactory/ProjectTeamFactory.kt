package com.example.designpatterns.creational.abstractFactory

interface ProjectTeamFactory {
    fun getDeveloper(): Developer
    fun getTester(): Tester
    fun getManager(): Manager
}