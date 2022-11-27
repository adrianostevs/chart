package com.github.fajaragungpramana.example

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.fajaragungpramana.chart.view.HorizontalBarChart

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val horizontalBarChart = findViewById<HorizontalBarChart>(R.id.hbc_view)

        val percentages = arrayListOf(50, 30)
        val backgrounds = arrayListOf(Color.RED, Color.YELLOW)

        horizontalBarChart.submitPercentage(percentages)
        horizontalBarChart.submitBackground(backgrounds)
    }

}