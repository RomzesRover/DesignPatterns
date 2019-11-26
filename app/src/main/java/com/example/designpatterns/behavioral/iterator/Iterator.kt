package com.example.designpatterns.behavioral.iterator

interface Iterator {
    fun hasNext(): Boolean

    fun next(): Any
}