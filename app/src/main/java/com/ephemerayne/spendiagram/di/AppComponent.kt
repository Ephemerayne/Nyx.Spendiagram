package com.ephemerayne.spendiagram.di

import com.ephemerayne.spendiagram.ui.MainActivity
import com.ephemerayne.spendiagram.ui.dialogSheet.AddSpendingDialog
import dagger.Component

@Component(
    modules = [
        AppModule::class,
        ViewModelsModule::class
    ]
)

interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(addSpendingDialog: AddSpendingDialog)
}