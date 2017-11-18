package org.madmeetup.extensions

/**
 * Created by vipshah on 6/8/17.
 */

fun Boolean.asInt(): Int {
    return if (this) 1 else 0
}

fun Int.asBoolean(): Boolean {
    return (this == 1)
}