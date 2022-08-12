package com.example.uitest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_select_music.*

class MainActivity : AppCompatActivity() {
    private lateinit var adapter : MusicAdapter

    private val list : MutableList<String> = mutableListOf("One more light",
    "The man who sold the world",
    "one step closer",
    "sound of silence",
    "bleed it out",
    "down with the sickness",
    "glimpse of us",
    "Skin",
    "in the end",
    "wastelands",
    "2 step",
    "no time to die",
    "A place for my head",
    "Nakoni bavar",
    "Fou",
    "popular monster",
    "castle of glass",
    "burning in the skies",
    "Beautiful",
    "Chera badi",
    "burn it down",
    "too late")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_music)
        val layoutManager  = LinearLayoutManager(this)
        musicRecycle.layoutManager = layoutManager
        adapter = MusicAdapter(list)
        musicRecycle.adapter = adapter
        supportActionBar?.hide()
    }
}