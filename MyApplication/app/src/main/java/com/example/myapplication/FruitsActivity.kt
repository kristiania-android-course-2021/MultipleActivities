package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView

class FruitsActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)

        findViewById<ImageView>( R.id.imageApple).setOnClickListener(this)
        findViewById<ImageView>( R.id.imageStrawberry).setOnClickListener(this)
        findViewById<ImageView>( R.id.imageOrange).setOnClickListener(this)

        Log.d(this.javaClass.simpleName, "onCreate")

    }

    override fun onClick(v: View?) {
        val drawableResId = when(v?.id) {
            R.id.imageApple->  R.drawable.apple
            R.id.imageOrange-> R.drawable.orange
            R.id.imageStrawberry-> R.drawable.strawberry
            else -> 0
        }

        var data = Intent()
        data.putExtra("fruit", drawableResId)
        setResult(RESULT_OK, data)
        finish()

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