package com.example.designpatterns.behavioral.visitor

interface ProjectElement {
    fun beWritten(developer: Developer)
}