package ru.netology.nmedia.ui

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator.REVERSE
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.R

@SuppressLint("SetTextI18n")
class AppActivity : AppCompatActivity(R.layout.activity_app) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = findViewById<StatsView>(R.id.stats)
      view.postDelayed({
            view.data = listOf(
                0.25F,
                0.25F,
                0.25F,
                0.25F,
            )
    }, 3000)


    }
}