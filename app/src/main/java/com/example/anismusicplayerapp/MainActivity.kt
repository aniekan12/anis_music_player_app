package com.example.anismusicplayerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songTitle  = findViewById<TextView>(R.id.song_title)
        val rewind = findViewById<Button>(R.id.rewind)
        val fastForward = findViewById<Button>(R.id.fast_forward)
        val play = findViewById<Button>(R.id.play)
        val pause = findViewById<Button>(R.id.pause)
        val seekBar = findViewById<SeekBar>(R.id.seek_bar)
    }
}