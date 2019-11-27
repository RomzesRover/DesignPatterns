package com.example.designpatterns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.designpatterns.behavioral.memento.run

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //run selected
        run()
    }
}
