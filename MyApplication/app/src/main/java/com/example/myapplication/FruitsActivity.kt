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

        //Todo whichone is clicked
        //Todo pack the result and finish (i.e. close) the opened activity
    }
}