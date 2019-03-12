package me.mehdi.playavd

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.leochuan.CarouselLayoutManager

class MainActivity : AppCompatActivity(), RecyclerAdapter.ItemClickListener{
    override fun onClick(image: ImageView) {
        val avd = image.drawable as AnimatedVectorDrawable
        avd.start()
    }

    val mDrawables = arrayOf(R.drawable.avd_heart, R.drawable.avd_tongue, R.drawable.avd_man, R.drawable.avd_writing, R.drawable.avd_clip_path)
    lateinit var mRecyclerView: RecyclerView

    lateinit var mHeartBtn:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val layoutManager = CarouselLayoutManager(applicationContext, 1)
        layoutManager.infinite = true
        mRecyclerView.layoutManager = layoutManager
        val adapter = RecyclerAdapter(applicationContext, mDrawables)
        adapter.setItemClickListener(this)
        mRecyclerView.adapter = adapter

    }
}
