package com.example.designpatterns.structural.flyweight

import com.example.designpatterns.PushToLog

class DeveloperFactory {
    companion object{
        private val developers = HashMap<String, Developer>()
    }

    fun getDeveloperBySpeciallity(speciality: String): Developer?{
        var developer: Developer? = developers[speciality]

        if (developer == null){
            developer = when (speciality.toLowerCase()){
                "java" -> JavaDeveloper()
                "c++" -> CppDeveloper()
                else -> null
            }
            developer?.let{
                PushToLog.l("Hiring new $speciality developer")
                developers[speciality.toLowerCase()]= it
            }
        }

        return developer
    }
}