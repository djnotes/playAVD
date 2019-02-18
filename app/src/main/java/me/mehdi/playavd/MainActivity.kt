package me.mehdi.playavd

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mPlayImage : ImageView = findViewById(R.id.play)


        val myAvd = findViewById<ImageView>(R.id.myAvd).background as AnimatedVectorDrawable
        myAvd.start()
        mPlayImage.setOnClickListener {
            val play = mPlayImage.background as AnimatedVectorDrawable
            play.start()
        }
    }
}
