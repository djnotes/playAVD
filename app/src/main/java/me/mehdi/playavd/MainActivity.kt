package me.mehdi.playavd

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.leochuan.CarouselLayoutManager

class MainActivity : AppCompatActivity(), RecyclerAdapter.ItemClickListener {
    override fun onClick(image: ImageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            val avd = image.drawable as AnimatedVectorDrawable
            avd.start()
        }
        //else, do nothing
    }

    val items = if (Build.VERSION.SDK_INT >= 21) arrayOf(
        Pair(R.drawable.avd_heart, R.string.heart),
        Pair(R.drawable.avd_tongue, R.string.tongue),
        Pair(R.drawable.avd_man, R.string.man),
        Pair(R.drawable.avd_heart_filling, R.string.heart_filling),
        Pair(R.drawable.avd_clip_path, R.string.clip_path)
    )
    else arrayOf(Pair(R.drawable.placeholder, R.string.placeholder))
    //    val mDrawables = arrayOf(R.drawable.avd_heart, R.drawable.avd_tongue, R.drawable.avd_man, R.drawable.avd_writing, R.drawable.avd_clip_path,R.drawable.avd_heart_filling)
    lateinit var mRecyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView = findViewById(R.id.recyclerView)
        val layoutManager = CarouselLayoutManager(applicationContext, 1)
        layoutManager.infinite = true
        mRecyclerView.layoutManager = layoutManager
        val adapter = RecyclerAdapter(applicationContext, items)
        adapter.setItemClickListener(this)
        mRecyclerView.adapter = adapter

    }
}
