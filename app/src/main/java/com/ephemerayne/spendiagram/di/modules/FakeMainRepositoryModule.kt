package com.ephemerayne.spendiagram.di.modules

import com.ephemerayne.spendiagram.data.FakeMainRepository
import com.ephemerayne.spendiagram.domain.main.MainRepository
import dagger.Module
import dagger.Provides

@Module
class FakeMainRepositoryModule {

    @Provides
    fun provideMainRepository(): MainRepository = FakeMainRepository()
}