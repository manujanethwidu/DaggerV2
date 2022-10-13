package com.mnm.daggerv2

import android.util.Log

class SmartPhone(val battery: Battery, val simCard: SimCard, val memoryCard: MemoryCard) {
    val tag: String = "MYTAG"

    init {
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailability()
        Log.i(tag, "Smart Phone Constructed")
    }

    fun makeACallWithRecording() {
        Log.i(tag, "Calling .........")
    }
}