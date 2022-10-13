package com.mnm.daggerv2

import android.util.Log

class Battery {
    val tag:String = "MYTAG"
    init {
        Log.i(tag,"Battery Constucted")
    }
    fun getPower(){
        Log.i(tag,"Batter power is available ")
    }
}