package io.ckmk.memegen.app

import androidx.multidex.MultiDexApplication
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MemegenApplication : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
    }
}