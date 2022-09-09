package com.ersinberkealemdaroglu.nosleepapp.data

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

object Utils {
    fun backStack(applicationContext: Context, activity: AppCompatActivity) {
        val intent = Intent(applicationContext, activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        applicationContext.startActivity(intent)
    }
}