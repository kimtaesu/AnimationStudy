package anim.hucet.com.animationstudy

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

/**
 * Created by taesu on 2017-12-16.
 */
fun Fragment.replace(fragmentManager: FragmentManager, @IdRes idRes: Int) {
    fragmentManager.beginTransaction()
            .replace(idRes, this)
            .commit()
}