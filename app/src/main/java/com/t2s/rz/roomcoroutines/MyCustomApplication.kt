package com.t2s.rz.roomcoroutines

import android.app.Application
import android.util.Log
import database.AppDatabase

class MyCustomApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.e(this.javaClass.canonicalName, "onCreate")
        AppDatabase.getDatabase(this)
    }


}
