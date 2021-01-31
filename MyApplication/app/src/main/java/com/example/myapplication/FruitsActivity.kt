package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.myapplication.databinding.ActivityFruitsBinding

class FruitsActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        var binding =  ActivityFruitsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageApple.setOnClickListener(this)
        binding.imageStrawberry.setOnClickListener(this)
        binding.imageOrange.setOnClickListener(this)

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
}