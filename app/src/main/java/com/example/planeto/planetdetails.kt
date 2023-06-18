package com.example.planeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_planetdetails.*

class planetdetails : AppCompatActivity() {
     lateinit var obj:PlanetData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planetdetails)
      obj= intent.getParcelableExtra("planet")!!
        planet_name.text=obj.title
        planet_img.setImageResource(obj.img!!)
        planet_id.text=obj.overview
        galaxy_name.text=obj.galaxy
        distance.text=obj.distance
        gravity.text=obj.gravity
    }
}