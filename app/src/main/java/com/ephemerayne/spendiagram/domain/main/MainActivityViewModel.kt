package com.ephemerayne.spendiagram.domain.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.ephemerayne.spendiagram.domain.entity.Spending
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
    private val repository: MainRepository
) : ViewModel() {
    fun getSpendings(): LiveData<List<Spending>> = repository.getSpendings()
}