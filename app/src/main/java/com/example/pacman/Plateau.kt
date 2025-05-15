package com.example.pacman

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Plateau( context : Context, attrs : AttributeSet) : View( context,attrs) {
    val Plateau : Bitmap
    val Plateauaffich : Bitmap

    init {
        Plateau = BitmapFactory.decodeResource(getResources(), R.drawable.pacmanmap)
        Plateauaffich = Bitmap.createBitmap(Plateau, 1, 1, 10, 10)

    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val p = Paint()
        canvas.drawBitmap(Plateau,-400F,1F,p)
    }
}
