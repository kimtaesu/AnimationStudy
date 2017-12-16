package anim.hucet.com.animationstudy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    private val adapter = AnimAdapter(Arrays.asList("Lottie", "Vector"), this, { item ->
        when (item) {
            "Lottie" -> {
                LottieFragment.newInstance().replace(supportFragmentManager, R.id.content1)
            }
            "Vector" -> {
                VectorFragment.newInstance().replace(supportFragmentManager, R.id.content1)
            }
        }
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            VectorFragment.newInstance().replace(supportFragmentManager, R.id.content1)
        }

        list_view.adapter = this.adapter
    }
}
