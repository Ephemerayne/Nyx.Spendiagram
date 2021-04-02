package com.ephemerayne.spendiagram.domain.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ephemerayne.spendiagram.domain.entity.Spending
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
    private val repository: MainRepository
) : ViewModel() {
    val testLiveData = MutableLiveData<List<Spending>>().apply {
        value = repository.getSpendings()
    }
}