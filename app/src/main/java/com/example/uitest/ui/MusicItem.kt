package com.example.uitest.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.uitest.R
import kotlinx.android.synthetic.main.list_item.view.*

class MusicItem(context: Context, attr: AttributeSet?) : LinearLayout(context, attr) {
    private var c = 1
    private val list: List<IconChanger> = listOf(ButtonIconChanger.CHANGE_TO_PLAY, ButtonIconChanger.CHANGE_TO_STOP)

    init{
        LayoutInflater.from(context).inflate(R.layout.list_item, this)
        playBtn.setOnClickListener {
            list[c].change(playBtn)
            c = (c+1)%list.size
        }
    }

}