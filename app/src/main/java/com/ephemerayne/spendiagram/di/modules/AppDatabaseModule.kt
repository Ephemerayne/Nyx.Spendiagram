package com.ephemerayne.spendiagram.di.modules

import android.app.Application
import androidx.room.Room
import com.ephemerayne.spendiagram.data.local.database.AppDatabase
import dagger.Module
import dagger.Provides

@Module
class AppDatabaseModule {

    @Provides
    fun provideDatabase(application: Application): AppDatabase = Room.databaseBuilder(
        application,
        AppDatabase::class.java,
        "app_database"
    ).build()
}