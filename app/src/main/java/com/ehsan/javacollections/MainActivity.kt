package com.ehsan.javacollections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<String>()
        list.add("1")
        list.add("2")
        list.add("3")

        list.forEach { element ->
            Log.d("w", "onCreate: $element")
        }

        for (element in list) {

        }

    }

}