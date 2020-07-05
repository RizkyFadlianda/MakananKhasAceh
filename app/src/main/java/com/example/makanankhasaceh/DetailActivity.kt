package com.example.makanankhasaceh

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)



        if(supportActionBar != null){
            (supportActionBar as ActionBar).title = intent.getStringExtra(EXTRA_NAME)
        }

        val imgPhotoReceived: ImageView = findViewById(R.id.gambarMakan)
        val tvNamaReceived:TextView = findViewById(R.id.namaMasakan)
        val tvDetailReceived:TextView = findViewById(R.id.detailMasakan)

        val nama = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_IMG,0)

        val namaMasakan = nama
        tvNamaReceived.text = namaMasakan

        val detailMasakan = detail
        tvDetailReceived.text = detailMasakan

        val photoMasakan = photo
        imgPhotoReceived.setImageResource(photoMasakan)

        var button: Button = findViewById(R.id.button)
        button.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button ->{
                finish()
            }
        }
    }
}
