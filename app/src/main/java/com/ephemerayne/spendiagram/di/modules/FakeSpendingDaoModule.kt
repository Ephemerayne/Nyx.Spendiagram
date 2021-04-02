package com.ephemerayne.spendiagram.di.modules

import com.ephemerayne.spendiagram.data.local.FakeSpendingDao
import com.ephemerayne.spendiagram.data.local.SpendingDao
import dagger.Module
import dagger.Provides

@Module
class FakeSpendingDaoModule {

    @Provides
    fun provideSpendingDao(): SpendingDao = FakeSpendingDao()
}