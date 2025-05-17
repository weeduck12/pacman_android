package com.example.pacman

import android.app.job.JobServiceEngine
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    lateinit var joueur : Joueur
    lateinit var balles: HashSet<Balle>
    lateinit var plateau: Plateau
    lateinit var fantome: fantome
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plateau = findViewById<Plateau>(R.id.plateau)
        val joueur = findViewById<Joueur>(R.id.joueur)

        if (plateau != null && joueur != null) {
            joueur.plateauRef = plateau
            joueur.deplacement()
        } else {
        }
    }
}
