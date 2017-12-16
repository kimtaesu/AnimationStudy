package anim.hucet.com.animationstudy

import android.content.Context
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import android.view.View
import android.widget.Checkable

/**
 * Created by taesu on 2017-12-16.
 */
typealias OnToggleListener = (ToggleImageView) -> Unit

class ToggleImageView(context: Context, attributes: AttributeSet) : AppCompatImageView(context, attributes), Checkable {
    private var mChecked: Boolean = false

    private var toggleListener: OnToggleListener? = null

    private val CHECKED_STATE_SET = intArrayOf(android.R.attr.state_checked)


    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (isChecked) {
            View.mergeDrawableStates(drawableState, CHECKED_STATE_SET)
        }
        return drawableState
    }

    override fun toggle() {
        isChecked = !mChecked
    }

    override fun isChecked(): Boolean = mChecked
    override fun setChecked(checked: Boolean) {
        if (mChecked != checked) {
            mChecked = checked
            toggleListener?.invoke(this)

        }
    }

    override fun performClick(): Boolean {
        toggle()
        return super.performClick()
    }
}