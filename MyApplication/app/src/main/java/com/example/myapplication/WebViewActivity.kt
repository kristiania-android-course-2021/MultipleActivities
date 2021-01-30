package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity


class WebViewActivity : AppCompatActivity() {


    companion object {
        const val LINK = "link"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_web_view)
        var webView = findViewById<WebView>(R.id.webView)

        //Todo getandload the link into webview
        

        Log.d(this.javaClass.simpleName, "onCreate")

    }

}