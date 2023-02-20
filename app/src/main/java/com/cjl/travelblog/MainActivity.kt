package com.cjl.travelblog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.cjl.travelblog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //This method binds our xml layout to this activity
        setContentView(R.layout.activity_main)

        //Now this binder object, gives us access to all our id, without having to explicitly
        //Label them like below
        val binder = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binder.root)


        binder.mainTextView.text = "Hello Educative.io"
    }
}