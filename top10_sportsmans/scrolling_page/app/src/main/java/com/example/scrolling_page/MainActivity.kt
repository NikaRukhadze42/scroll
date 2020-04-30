package com.example.scrolling_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<Item>()
    private lateinit var adapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        adapter = RecyclerViewAdapter(items)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        setData()
    }

    private fun setData()
    {
        items.add(Item(R.mipmap.ic_tiger,  "1", "Tiger Woods - Golf Player"))
        items.add(Item(R.mipmap.ic_lewis,  "2", "Lewis Hamilton - F1 Driver"))
        items.add(Item(R.mipmap.ic_messi,  "3-4", "Lionel Messi - Football Player"))
        items.add(Item(R.mipmap.ic_ronaldo,  "3-4", "Cristiano Ronaldo - Football Player"))
        items.add(Item(R.mipmap.ic_rossi,  "5", "Valentino Rossi - Moto GP Driver"))
        items.add(Item(R.mipmap.ic_kobe,  "6", "Kobe Bryant - Basketball Player"))
        items.add(Item(R.mipmap.ic_marquez,  "7", "Marc Marquez - Moto GP Driver"))
        items.add(Item(R.mipmap.ic_usain,  "8", "Usain Bolt - Sprinter"))
        items.add(Item(R.mipmap.ic_brady,  "9", "Tom Brady NFL PLayer"))
        items.add(Item(R.mipmap.ic_lebron,  "10", "LeBron James - Basketball Player"))
    }

}

