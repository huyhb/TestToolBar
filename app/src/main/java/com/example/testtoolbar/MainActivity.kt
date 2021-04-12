package com.example.testtoolbar

import android.graphics.Point
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.tool_bar.view.*
import kotlin.math.abs


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var adapterStr = StringAdapter(creatListString())
        rcv_list.adapter = adapterStr
        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rcv_list.layoutManager = layoutManager
        rcv_list.hasFixedSize()

    }
    fun creatListString(): List<String> {
        var list : MutableList<String> = mutableListOf()
        for (i in 1..50){
            list.add("Item ${i}")
        }
        return list
    }

}