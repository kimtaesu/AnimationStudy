package anim.hucet.com.animationstudy

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * Created by taesu on 2017-12-16.
 */

class AnimAdapter(private val items: List<String>,
                  private val context: Context,
                  private val onClickListener: (String) -> Unit) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val v = LayoutInflater.from(context).inflate(R.layout.item_anim, null, false)
        v.setOnClickListener({
            onClickListener?.invoke(items[position])
        })
        val t = v.findViewById<TextView>(R.id.title)
        t.text = items[position]
        return v
    }

    override fun getItem(position: Int): Any = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = items.size

}