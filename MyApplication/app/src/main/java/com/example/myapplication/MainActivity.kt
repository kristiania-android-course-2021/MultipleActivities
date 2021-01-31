package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val FRUIT_REQUEST = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        var binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(this.javaClass.simpleName, "onCreate")

        binding.openInWebView.setOnClickListener {

            var intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("link", binding.editText.editableText.toString())
            startActivity(intent)

        }

        binding.button2.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(binding.editText.editableText.toString())
            startActivity(intent)

        }

        binding.imageViewSelectedFruit.setOnClickListener {
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