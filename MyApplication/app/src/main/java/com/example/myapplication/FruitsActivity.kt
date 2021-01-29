package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class FruitsActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)

        findViewById<ImageView>( R.id.imageApple).setOnClickListener(this)
        findViewById<ImageView>( R.id.imageStrawberry).setOnClickListener(this)
        findViewById<ImageView>( R.id.imageOrange).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val drawableResId = when(v?.id) {
            R.id.imageApple->  R.drawable.apple
            R.id.imageOrange-> R.drawable.orange
            R.id.imageStrawberry-> R.drawable.strawberry
            else -> 0
        }

        var result = Intent()
        result.putExtra("fruit", drawableResId)
        setResult(RESULT_OK, result)

        finish()
    }



}