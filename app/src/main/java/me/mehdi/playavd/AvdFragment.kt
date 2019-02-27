package me.mehdi.playavd


import android.graphics.drawable.AnimatedVectorDrawable
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AvdFragment : Fragment() {
    /**
     * AVD resource file passed to this fragment to be animated
     */
    private var mAvdResource: Int = 0;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_avd, container, false)
    }


    override fun setArguments(args: Bundle?) {
        super.setArguments(args)
        mAvdResource = args!!.getInt(AVD_RES)
    }

    private val LOG_TAG = javaClass.name

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val root = activity!!.findViewById<ViewGroup>(R.id.fragment_root)

        Log.d(LOG_TAG, "AVD Reource passed: " + mAvdResource.toString())


        root.setBackgroundResource(mAvdResource)



        val avd = root.background as AnimatedVectorDrawable
        avd.start()

    }

    companion object {
        val AVD_RES = "avd_resource"
    }
}
