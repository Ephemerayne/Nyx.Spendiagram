package com.ephemerayne.spendiagram.di

import com.ephemerayne.spendiagram.di.modules.AppModule
import com.ephemerayne.spendiagram.di.modules.FakeSpendingDaoModule
import com.ephemerayne.spendiagram.di.modules.MainRepositoryModule
import com.ephemerayne.spendiagram.di.modules.ViewModelsModule
import com.ephemerayne.spendiagram.ui.MainActivity
import com.ephemerayne.spendiagram.ui.dialogSheet.AddSpendingDialog
import dagger.Component

@Component(
    modules = [
        AppModule::class,
        ViewModelsModule::class,
        MainRepositoryModule::class,
        FakeSpendingDaoModule::class
    ]
)

interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(addSpendingDialog: AddSpendingDialog)
}