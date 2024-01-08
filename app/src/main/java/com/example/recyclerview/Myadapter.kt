package com.example.recyclerview

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Myadapter(var newsarraylist:ArrayList<News>,var context: Activity):RecyclerView.Adapter<Myadapter.MyViewHolder>() {

    //to create new view instance in case layout manager fails to find suitable view for each item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myadapter.MyViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.eachitem,parent,false)
        return MyViewHolder(itemView)
    }
//
    override fun onBindViewHolder(holder: Myadapter.MyViewHolder, position: Int) {
val curretItem=newsarraylist[position]
    holder.headtitle.text=curretItem.newsheading
    holder.htimage.setImageResource(curretItem.newsimg)
    }

    override fun getItemCount(): Int {
     return newsarraylist.size
    }

    //it holds view so views are not created every time ,if increases the responsiveness of ui
    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

        val headtitle=itemView.findViewById<TextView>(R.id.tvheadingtitle)
        val htimage=itemView.findViewById<ImageView>(R.id.headingimg)


    }
}