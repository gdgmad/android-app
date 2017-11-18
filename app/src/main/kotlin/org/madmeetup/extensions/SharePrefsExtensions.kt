@file:JvmName("SharedPrefsUtils")

package org.madmeetup.extensions

import android.content.SharedPreferences

/**
 * Created by nikthakkar on 5/31/17.
 */

inline fun SharedPreferences.edit(body: SharedPreferences.Editor.() -> Unit) {
    val editor: SharedPreferences.Editor = edit()
    editor.body()
    editor.apply()
}

fun SharedPreferences.Editor.set(pair: Pair<String, String>) = putString(pair.first, pair.second)