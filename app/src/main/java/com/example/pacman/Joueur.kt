package com.example.pacman

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Joueur( context : Context, attrs : AttributeSet) : View( context,attrs) {
    val image: Bitmap
    val pacmanJoueur : Bitmap
    var x: Int
    var y: Int
    init {
        image = BitmapFactory.decodeResource(getResources(), R.drawable.pacman)
        pacmanJoueur = Bitmap.createBitmap(image, 20, 705, 50, 65);
        x = 400
        y = 600
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val p = Paint()
        canvas.drawBitmap(pacmanJoueur,1000F,1000F,p)
    }
}
