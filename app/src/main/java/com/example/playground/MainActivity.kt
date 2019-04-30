package com.example.playground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonShow.setOnClickListener {
            showFab(R.drawable.ic_info)
        }
    }

    private fun showFab(drawableResId: Int, stringResId: Int = 0) {
        fab.setIconResource(drawableResId)
        if (stringResId != 0) {
            fab.setText(stringResId)
            fab.extend()
        } else {
            fab.shrink()
            fab.text = null
        }
        fab.show()
    }
}
