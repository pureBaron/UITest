package com.example.uitest.ui


import android.widget.TextView
import com.example.uitest.R
import kotlinx.android.synthetic.main.list_item.view.*

enum class ButtonIconChanger(private val nameIn: String, private val ic: IconChanger) : IconChanger {
    CHANGE_TO_PLAY("to play", object : IconChanger {
        override fun change(txtView: TextView) {
            txtView.setBackgroundResource(R.drawable.ic_play_arrow_fill0_wght400_grad0_opsz48)
        }
    }),
    CHANGE_TO_STOP("to stop", object: IconChanger{
        override fun change(txtView: TextView) {
            txtView.setBackgroundResource(R.drawable.ic_pause_fill0_wght400_grad0_opsz48)
        }
    })
    ;



    override fun change(txtView: TextView){
        this.ic.change(txtView)
    }

    override fun toString(): String {
        return this.nameIn
    }
}