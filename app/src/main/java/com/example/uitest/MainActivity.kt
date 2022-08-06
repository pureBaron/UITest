package com.example.uitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_select_music.*

class MainActivity : AppCompatActivity() {

    private val list : List<String> = listOf("One more light",
    "The man who sold the world",
    "one step closer",
    "sound of silence",
    "down with the sickness",
    "glimpse of us",
    "Skin",
    "2 step",
    "A place for my head")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_music)

        val layoutManager  = LinearLayoutManager(this)
        musicRecycle.layoutManager = layoutManager

        val adapter = MusicAdapter(list)
        musicRecycle.adapter = adapter
    }
}