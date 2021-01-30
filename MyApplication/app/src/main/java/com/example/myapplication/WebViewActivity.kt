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

        var link = intent.getStringExtra("link")
        webView.loadUrl(link)

        Log.d(this.javaClass.simpleName, "onCreate")

    }

    override fun onStart() {
          super.onStart()
          Log.d(this.javaClass.simpleName, "onStart")
    }

    override fun onResume() {
            super.onResume()
            Log.d(this.javaClass.simpleName, "onResume")
    }

    override fun onPause() {
            super.onPause()
            Log.d(this.javaClass.simpleName, "onPause")
    }

    override fun onStop() {
            super.onStop()
            Log.d(this.javaClass.simpleName, "onStop")
    }

    override fun onDestroy() {
            super.onDestroy()
            Log.d(this.javaClass.simpleName, "onDestroy")
    }

        override fun onRestart() {
            super.onRestart()
            Log.d(this.javaClass.simpleName, "onRestart")
        }

}