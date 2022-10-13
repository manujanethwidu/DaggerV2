package com.mnm.daggerv2

import android.util.Log

class SimCard(private val serviceProvider: ServiceProvider) {
    val tag: String = "MYTAG"

    init {
        Log.i(tag, "Sim Card Constructed")
    }

    fun getConnection() {
        serviceProvider.getServiceProvider()
    }
}