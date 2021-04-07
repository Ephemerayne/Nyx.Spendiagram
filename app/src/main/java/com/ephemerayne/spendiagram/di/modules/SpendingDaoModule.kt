package com.ephemerayne.spendiagram.di.modules

import com.ephemerayne.spendiagram.data.local.SpendingDao
import com.ephemerayne.spendiagram.data.local.database.AppDatabase
import dagger.Module
import dagger.Provides

@Module
class SpendingDaoModule {

    @Provides
    fun provideSpendingDao(database: AppDatabase): SpendingDao = database.spendingsDao()
}