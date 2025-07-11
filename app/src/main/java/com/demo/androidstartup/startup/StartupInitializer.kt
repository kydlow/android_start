package com.demo.androidstartup.startup

import android.content.Context
import android.os.Trace
import android.util.Log
import androidx.startup.Initializer

class StartupInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        Log.d("startup_demo", "StartupInitializer onCreate()")
    }

    override fun dependencies(): List<Class<out Initializer<*>?>> {
        // 指定依赖（如果需要其他 Initializer 先执行）
        return emptyList()
    }
}