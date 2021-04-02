package com.ephemerayne.spendiagram

import android.app.Application
import com.ephemerayne.spendiagram.di.AppComponent
import com.ephemerayne.spendiagram.di.DaggerAppComponent
import com.ephemerayne.spendiagram.di.modules.AppModule
import com.jakewharton.threetenabp.AndroidThreeTen

class App: Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
        appComponent = initAppComponent()
    }

    private fun initAppComponent(): AppComponent = DaggerAppComponent.builder()
        .appModule(AppModule(this))
        .build()
}