package com.ephemerayne.spendiagram.di.modules

import com.ephemerayne.spendiagram.data.local.MainRepositoryImpl
import com.ephemerayne.spendiagram.data.local.SpendingDao
import com.ephemerayne.spendiagram.domain.main.MainRepository
import dagger.Module
import dagger.Provides

@Module
class MainRepositoryModule {

    @Provides
    fun provideMainRepository(spendingDao: SpendingDao): MainRepository =
        MainRepositoryImpl(spendingDao)
}