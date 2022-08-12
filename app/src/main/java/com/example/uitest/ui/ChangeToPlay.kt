package com.example.uitest.ui

import android.widget.TextView
import com.example.uitest.R

class ChangeToPlay(private val txtV: TextView, ic: IconChanger): IconChangerWrapper(ic) {

    override fun change(txtView: TextView){
        super.change(txtView)
    }
}