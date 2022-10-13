package com.mnm.daggerv2

import android.util.Log

class MemoryCard {
    val tag: String = "MYTAG"

    init {
        Log.i(tag, "Memory Card Constucted")
    }

    fun getSpaceAvailability() {
        Log.i(tag, "Memory Card space is available ")
    }
}