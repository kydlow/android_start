package com.demo.androidstartup

import android.app.Application
import android.content.Context
import android.os.Trace
import android.util.Log

class MyApplication : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        Log.i("startup_demo","attachBaseContext")
    }
    override fun onCreate() {
        super.onCreate()

        Log.i("startup_demo","onApp create")
    }
}