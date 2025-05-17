package com.example.pacman

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Plateau(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private val plateau = BitmapFactory.decodeResource(resources, R.drawable.pacmanmap)
    private var scaledPlateau: Bitmap? = null
    
    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        scaledPlateau = Bitmap.createScaledBitmap(plateau, width, height, true)
    }
    
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        scaledPlateau?.let { bitmap ->
            canvas.drawBitmap(bitmap, 0f, 0f, null)
        }
    }

    fun getBitmap(): Bitmap {
        return scaledPlateau ?: plateau
    }
}
