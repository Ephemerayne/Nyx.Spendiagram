package com.ephemerayne.spendiagram.di.modules

import androidx.lifecycle.ViewModel
import com.ephemerayne.spendiagram.di.ViewModelKey
import com.ephemerayne.spendiagram.domain.addspending.AddSpendingDialogViewModel
import com.ephemerayne.spendiagram.domain.main.MainActivityViewModel
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
    abstract fun addSpendingDialogViewModel(viewModel: AddSpendingDialogViewModel): ViewModel
}