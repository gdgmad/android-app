package org.madmeetup.extensions

import android.app.Activity
import android.support.v4.content.ContextCompat
import android.util.DisplayMetrics
import android.util.Log
import org.madmeetup.BuildConfig

/**
 * Created by nikthakkar on 11/3/17.
 */
fun Activity.log(msg: String) {
    if (BuildConfig.DEBUG) {
        Log.d(this.javaClass.simpleName, msg)
    }
}

fun Activity.screenWidth(): Int {
    val metrics: DisplayMetrics = DisplayMetrics()
    windowManager.defaultDisplay.getMetrics(metrics)
    return metrics.widthPixels
}

fun Activity.screenHeight(): Int {
    val metrics: DisplayMetrics = DisplayMetrics()
    windowManager.defaultDisplay.getMetrics(metrics)
    return metrics.heightPixels
}

fun Activity.color(resId: Int): Int {
    return ContextCompat.getColor(this, resId)
}
