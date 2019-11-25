package com.example.designpatterns.structural.composite

import com.example.designpatterns.PushToLog

class PythonDeveloper : Developer {
    override fun writeCode() {
        PushToLog.l("Python developer write his python code")
    }

}
