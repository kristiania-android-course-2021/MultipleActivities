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

            var intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("link", editText.editableText.toString())
            startActivity(intent)

        }

        openInBrowser.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(editText.editableText.toString())
            startActivity(intent)

        }

        imageViewSelectFruit.setOnClickListener {
            var intent = Intent(this, FruitsActivity::class.java)
            startActivityForResult(intent, FRUIT_REQUEST)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if( requestCode == FRUIT_REQUEST && resultCode == RESULT_OK ){
            var resId = data?.getIntExtra("fruit", 0)

            if(resId!= 0) {
                var imageViewSelectFruit = findViewById<ImageView>(R.id.imageViewSelectedFruit)
                imageViewSelectFruit.setImageResource(resId!!)
            }
        }
    }
}