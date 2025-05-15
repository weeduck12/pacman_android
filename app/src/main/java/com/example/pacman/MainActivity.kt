package com.example.pacman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var joueur : Joueur
    lateinit var balles: HashSet<Balle>
    lateinit var plateau: Plateau
    lateinit var fantome: fantome
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
