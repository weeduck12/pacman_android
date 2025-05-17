package com.example.pacman

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Handler
import android.os.Looper
import android.util.AttributeSet
import android.util.Log
import android.view.View

class Joueur(context: Context, attrs: AttributeSet? = null) : View(context, attrs) {
    val image: Bitmap
    val pacmanJoueur: Bitmap
    var posX = 300f
    var posY = 450f
    var speed = 10f
    val movehandler = Handler(Looper.getMainLooper())
    val temp = 16L
    var plateauRef: Plateau? = null
    companion object {
        private const val WALL_COLOR = -14605825
    }
    init {
        image = BitmapFactory.decodeResource(getResources(), R.drawable.pacman)
        pacmanJoueur = Bitmap.createBitmap(image, 20, 705, 50, 65)
    }
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawBitmap(pacmanJoueur, posX, posY, null)
    }
    fun deplacement() {
        movehandler.post(object : Runnable {
            override fun run() {
                val regardDevant = (posX + speed + 10).toInt()
                
                plateauRef?.getBitmap()?.let { bitmap ->
                    val pointsDetection = listOf(
                        regardDevant to (posY + 25).toInt(),
                        regardDevant to (posY + 10).toInt(),
                        regardDevant to (posY + 40).toInt()
                    )
                    var collision = false
                    for ((x, y) in pointsDetection) {
                        if (x >= 0 && x < bitmap.width && y >= 0 && y < bitmap.height) {
                            val couleurDevant = bitmap.getPixel(x, y)
                            
                            if (couleurDevant == WALL_COLOR) {
                                collision = true
                                break
                            }
                        }
                    }
                    if (!collision) {
                        posX += speed
                    } else {
                    }
                }
                
                invalidate()
                movehandler.postDelayed(this, temp)
            }
        })
    }
}
