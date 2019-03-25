package com.t2s.rz.roomcoroutines

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.t2s.rz.roomcoroutines.provider.MainProvider
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = MainProvider().addStoreData()
    }
}
