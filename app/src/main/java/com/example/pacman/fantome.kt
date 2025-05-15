package com.example.pacman

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class fantome( context : Context, attrs : AttributeSet) : View( context,attrs) {
    val image: Bitmap
    val fantome : Bitmap
    var x: Int
    var y: Int
    init {
        image = BitmapFactory.decodeResource(getResources(), R.drawable.pacman)
        fantome = Bitmap.createBitmap(image, 10, 455, 61, 61);
        x = 400
        y = 600
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val p = Paint()
        canvas.drawBitmap(fantome,500F,500F,p)
    }
}