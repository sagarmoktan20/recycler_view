package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView: RecyclerView
    lateinit var newarraylist:ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView=findViewById(R.id.recyclerview)
        var newsimgarray= arrayOf(
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
        )
        var headingarray= arrayOf(
            "obito uchia childhood photos leaked",
             "kakashi found cheating on his job",
        "ten tails successfully stopped by leaf village",
        "team 7 found relaxing on their summer vacation"
            )
        //to set the layout of recycler view like linear vertical
        myRecyclerView.layoutManager=LinearLayoutManager(this)
        newarraylist= arrayListOf<News>()

        for (everyIndex in newsimgarray.indices){
            val news=News(headingarray[everyIndex],newsimgarray[everyIndex])
            newarraylist.add(news)
        }

        myRecyclerView.adapter=Myadapter(newarraylist,this)





    }
}