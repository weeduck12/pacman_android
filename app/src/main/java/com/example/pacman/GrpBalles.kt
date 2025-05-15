package com.example.pacman

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View



class GrpBalles(context : Context, attrs : AttributeSet) : View( context,attrs) {

    var balles: HashSet<Balle> = HashSet()

    val b = Bitmap.createBitmap(BitmapFactory.decodeResource(resources, R.drawable.pacman), 610,15,30,30)
    init {
        balles.add(Balle(100, 100))
        balles.add(Balle(300, 200))
        balles.add(Balle(800, 600))
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val p = Paint()

        for (balle in balles) {
            canvas.drawBitmap(b, balle.x.toFloat(),balle.y.toFloat(),p)
        //    canvas.drawBitmap(pacmanJoueur,1000F,1000F,p)
        }
    }
}