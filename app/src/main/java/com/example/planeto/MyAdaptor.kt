package com.example.planeto

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

class MyAdaptor(val planet:List<PlanetData>):RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView=LayoutInflater.from(parent.context)
        .inflate(R.layout.view,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            var intent= Intent(holder.itemView.context,planetdetails::class.java)
            intent.putExtra("id",position)
            intent.putExtra("planet",planet[position])
            holder.itemView.context.startActivity(intent)
        }
     holder.title.text=planet[position].title
        holder.distance.text=planet[position].distance+"km"
        holder.gravity.text=planet[position].gravity
        holder.galaxy.text=planet[position].galaxy
        holder.planetimg.setImageResource(planet[position].img!!)

    }

    override fun getItemCount(): Int {
        return planet.size
    }
}

class MyViewHolder(view: View):RecyclerView.ViewHolder(view){
var title=view.planet_name
    var galaxy=view.galaxy_name
    var distance=view.distance
    var gravity=view.gravity
    var planetimg=view.planet_img
}