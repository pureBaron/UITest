package com.example.uitest.ui

import android.widget.TextView

abstract class IconChangerWrapper(protected val ic: IconChanger): IconChanger {

    override fun change(txtView: TextView){
        this.ic.change(txtView)
    }
}