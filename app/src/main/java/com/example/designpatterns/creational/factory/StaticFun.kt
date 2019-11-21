package com.example.designpatterns.creational.factory

import java.lang.RuntimeException

fun createDeveloperFactoryBySpecialty(specialty: String): DeveloperFactory{
    return when (specialty){
        "java" -> JavaDeveloperFactory()
        "cpp" -> CppDeveloperFactory()
        "php" -> PhpDeveloperFactory()
        else -> throw RuntimeException("$specialty is unknown specialty")
    }
}