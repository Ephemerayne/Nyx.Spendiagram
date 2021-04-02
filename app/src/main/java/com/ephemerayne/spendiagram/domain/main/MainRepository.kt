package com.ephemerayne.spendiagram.domain.main

import androidx.lifecycle.LiveData
import com.ephemerayne.spendiagram.domain.entity.Spending

interface MainRepository {

    fun getSpendings(): LiveData<List<Spending>>
}