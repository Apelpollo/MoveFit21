package com.example.movefit21

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val videoView = findViewById<VideoView>(R.id.videoView)
        val mediaController = MediaController(this)


        val videoPath = "android.resource://" + packageName + "/" + R.raw.signupv
        val videoUri = Uri.parse(videoPath)

        videoView.setOnPreparedListener { mp ->
            mp.isLooping = true
            videoView.start()
        }



        videoView.setVideoURI(videoUri)

        videoView.start()
    }
}