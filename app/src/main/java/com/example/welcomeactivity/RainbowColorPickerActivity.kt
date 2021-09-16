package com.example.welcomeactivity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class RainbowColorPickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty1)

        fun setRainbowColor(colorName: String, color: Int) {
            Intent().let { pickedColorIntent ->
                pickedColorIntent.putExtra(RAINBOW_COLOR_NAME,
                        colorName)
                pickedColorIntent.putExtra(RAINBOW_COLOR, color)
                setResult(Activity.RESULT_OK, pickedColorIntent)
                finish()
            }
        }

        val colorPickerClickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.red -> setRainbowColor(
                        getString(R.string.red), R.color.red)
                R.id.orange -> setRainbowColor(
                        getString(R.string.orange), R.color.orange)
                R.id.yellow -> setRainbowColor(
                        getString(R.string.yellow), R.color.yellow)
                R.id.green -> setRainbowColor(
                        getString(R.string.green), R.color.green)
                R.id.blue -> setRainbowColor(
                        getString(R.string.blue), R.color.blue)
                R.id.indigo -> setRainbowColor(
                        getString(R.string.indigo), R.color.indigo)
                R.id.violet -> setRainbowColor(
                        getString(R.string.violet), R.color.violet)
                else -> {
                    Toast.makeText(this, getString(
                            R.string.unexpected_color), Toast.LENGTH_LONG)
                            .show()
                }
            }
        }

        findViewById<View>(R.id.red).setOnClickListener(colorPickerClickListener)
        findViewById<View>(R.id.orange).setOnClickListener(colorPickerClickListener)
        findViewById<View>(R.id.yellow).setOnClickListener(colorPickerClickListener)
        findViewById<View>(R.id.green).setOnClickListener(colorPickerClickListener)
        findViewById<View>(R.id.blue).setOnClickListener(colorPickerClickListener)
        findViewById<View>(R.id.indigo).setOnClickListener(colorPickerClickListener)
        findViewById<View>(R.id.violet).setOnClickListener(colorPickerClickListener)

    }
}