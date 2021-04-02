package com.ephemerayne.spendiagram.di

import com.ephemerayne.spendiagram.di.modules.AppModule
import com.ephemerayne.spendiagram.di.modules.FakeMainRepositoryModule
import com.ephemerayne.spendiagram.di.modules.ViewModelsModule
import com.ephemerayne.spendiagram.ui.MainActivity
import com.ephemerayne.spendiagram.ui.dialogSheet.AddSpendingDialog
import dagger.Component

@Component(
    modules = [
        AppModule::class,
        ViewModelsModule::class,
        FakeMainRepositoryModule::class
    ]
)

interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(addSpendingDialog: AddSpendingDialog)
}