package me.mehdi.playavd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.Group
import androidx.transition.Fade
import androidx.transition.Transition
import androidx.transition.TransitionManager
import androidx.viewbinding.ViewBinding
import me.mehdi.playavd.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    lateinit var mViewBinding : ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityWelcomeBinding.inflate(layoutInflater)

        setContentView(mViewBinding.root)
    }

    fun startAnimation(view: View) {
        val group1 : Group = mViewBinding.group1
        val group2 : Group = mViewBinding.group2

        val transition1 = Fade()
        val transition2 = Fade()

        transition1.addListener(object:Transition.TransitionListener{
            override fun onTransitionEnd(transition: Transition) {
                TransitionManager.beginDelayedTransition(mViewBinding.root, transition2)
                group2.visibility = View.VISIBLE
            }

            override fun onTransitionResume(transition: Transition) {
            }

            override fun onTransitionPause(transition: Transition) {
            }

            override fun onTransitionCancel(transition: Transition) {
            }

            override fun onTransitionStart(transition: Transition) {
            }

        })

        TransitionManager.beginDelayedTransition(mViewBinding.root, transition1)
        group1.visibility = View.GONE


    }
}