package com.ephemerayne.spendiagram.di

import androidx.lifecycle.ViewModel
import com.ephemerayne.spendiagram.domain.main.MainActivityViewModel
import com.ephemerayne.spendiagram.ui.dialogSheet.AddSpendingDialogViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun mainActivityViewModel(viewModel: MainActivityViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AddSpendingDialogViewModel::class)
    abstract fun addSpendingDialogViewModel(viewModel:AddSpendingDialogViewModel): ViewModel
}