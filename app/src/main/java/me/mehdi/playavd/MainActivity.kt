package me.mehdi.playavd

import android.graphics.drawable.Animatable
import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val rootVG = findViewById<ViewGroup>(R.id.root)

        val animatedGradient = rootVG.background as AnimatedVectorDrawable

        animatedGradient.start()

//        val mPlayImage: ImageView = findViewById(R.id.play)
//
//
//        val myAvd = findViewById<ImageView>(R.id.myAvd).background as AnimatedVectorDrawable
//        myAvd.start()
//        mPlayImage.setOnClickListener {
//            val play = mPlayImage.drawable as AnimatedVectorDrawable
//            play.start()
//            val avdMan = findViewById<ImageView>(R.id.man).drawable as AnimatedVectorDrawable
//            avdMan.start()
//
//
//            val writing = findViewById(R.id.writing) as ImageView
//            writing.visibility = View.VISIBLE
//            val avdWriting = writing.drawable as AnimatedVectorDrawable
//            avdWriting.start()
//
//            val tongue = findViewById(R.id.tongue) as ImageView
//            val avdTongue = tongue.drawable as AnimatedVectorDrawable
//            avdTongue.start()

//        }
    }
}
