package com.github.fajaragungpramana.chart.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout

class HorizontalBarChart(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    private val mListChartPercentage by lazy { arrayListOf<Int>() }
    private val mListChartBackground by lazy { arrayListOf<Int>() }

    init {
        orientation = HORIZONTAL
    }

    fun submitPercentage(data: List<Int>) {
        mListChartPercentage.clear()
        mListChartPercentage.addAll(data)
    }

    fun submitBackground(data: List<Int>) {
        mListChartBackground.clear()
        mListChartBackground.addAll(data)
    }

    override fun onWindowFocusChanged(hasWindowFocus: Boolean) {
        super.onWindowFocusChanged(hasWindowFocus)
        removeAllViews()

        if (mListChartPercentage.isNotEmpty()) {
            for (i in mListChartPercentage.indices) {

                val bar = View(context)
                val barWidth = (width * mListChartPercentage[i]) / 100

                if (mListChartBackground.isNotEmpty() && mListChartBackground.size <= mListChartPercentage.size)
                    bar.setBackgroundColor(mListChartBackground[i])

                bar.layoutParams = LayoutParams(barWidth, LayoutParams.MATCH_PARENT)

                addView(bar)

            }
        }

    }

}