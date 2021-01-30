package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val FRUIT_REQUEST = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        Log.d(this.javaClass.simpleName, "onCreate")

        var editText = findViewById<EditText>(R.id.editText)
        var openInWebView = findViewById<Button>(R.id.button1)
        var openInBrowser = findViewById<Button>(R.id.button2)
        var imageViewSelectFruit = findViewById<ImageView>(R.id.imageViewSelectedFruit)


        openInWebView.setOnClickListener {
            //Todo: startWebView start WebViewActivity and pass link from editText
        }

        openInBrowser.setOnClickListener {
            //Todo: openbrowser start browser   and pass link from editText
        }

        imageViewSelectFruit.setOnClickListener {
            //Todo openfruit startActivityForResult
        }
    }


    //Todo override onActivityResult
    //Todo getresult

}