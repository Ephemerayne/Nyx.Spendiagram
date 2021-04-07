package com.ephemerayne.spendiagram.di

import com.ephemerayne.spendiagram.di.modules.*
import com.ephemerayne.spendiagram.ui.MainActivity
import com.ephemerayne.spendiagram.ui.addspending.AddSpendingDialog
import dagger.Component

@Component(
    modules = [
        AppModule::class,
        AppDatabaseModule::class,
        ViewModelsModule::class,
        MainRepositoryModule::class,
        SpendingDaoModule::class
    ]
)

interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(addSpendingDialog: AddSpendingDialog)
}