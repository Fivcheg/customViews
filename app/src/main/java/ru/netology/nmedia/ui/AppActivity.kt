package ru.netology.nmedia.ui

import android.os.Bundle
import android.view.animation.AccelerateInterpolator
import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.R

class AppActivity : AppCompatActivity(R.layout.activity_app) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = findViewById<StatsView>(R.id.stats)
        view.postDelayed({
            view.data = listOf(
                500F,
                500F,
                500F,
                500F,
                )
        }, 1000)

        view.animate()
            .rotation(360F)
            .setInterpolator(AccelerateInterpolator())
            .setStartDelay(500)
            .setDuration(1000)
            .start()

    }
}