package anim.hucet.com.animationstudy

import android.os.Bundle
import android.support.graphics.drawable.AnimatedVectorDrawableCompat
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.vector_fragment.*

/**
 * Created by taesu on 2017-12-16.
 */
class VectorFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.vector_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        svg_play.setOnClickListener {
            svg_play.setImageDrawable(
                    if (svg_play.isChecked) {
                        createAnimateVector(R.drawable.v_youtube_play_animation).also { it?.start() }
                    } else {
                        createAnimateVector(R.drawable.v_youtube_stop_animation).also { it?.start() }
                    })
        }
    }

    private fun createAnimateVector(animRes: Int): AnimatedVectorDrawableCompat? {
        return AnimatedVectorDrawableCompat.create(
                activity, animRes)
    }

    override fun onStop() {
        super.onStop()
    }

    companion object {
        fun newInstance(): VectorFragment {
            return VectorFragment()
        }
    }
}