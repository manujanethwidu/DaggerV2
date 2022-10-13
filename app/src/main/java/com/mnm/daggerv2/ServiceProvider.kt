package com.mnm.daggerv2

import android.util.Log

class ServiceProvider {
    val tag:String = "MYTAG"
    init {
        Log.i(tag,"ServiceProvider Constucted")
    }
    fun getServiceProvider(){
        Log.i(tag,"Connection Establsihed ")
    }
}