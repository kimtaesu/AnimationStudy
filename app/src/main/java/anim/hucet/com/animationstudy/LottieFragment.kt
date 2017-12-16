package anim.hucet.com.animationstudy

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.lottie_fragment.*

/**
 * Created by taesu on 2017-12-16.
 */
class LottieFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.lottie_fragment, container, false)
    }


    override fun onStart() {
        super.onStart()
        animationView.playAnimation()
    }

    override fun onStop() {
        super.onStop()
        animationView.cancelAnimation()
    }

    companion object {
        fun newInstance(): LottieFragment {
            return LottieFragment()
        }
    }
}