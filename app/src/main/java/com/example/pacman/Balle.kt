package com.example.pacman

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Balle(posx:Int,posy:Int) {
    val image: Int = R.drawable.balle

    var x : Int = posx
    var y : Int = posy
}