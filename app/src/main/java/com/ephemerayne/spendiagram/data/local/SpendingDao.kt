package com.ephemerayne.spendiagram.data.local

import androidx.lifecycle.LiveData
import com.ephemerayne.spendiagram.domain.entity.Spending

interface SpendingDao {

    fun insertSpending(spending: Spending)

    fun getSpending(id: Int): LiveData<Spending>

    fun getAllSpendings(): LiveData<List<Spending>>

    fun deleteSpending(id: Int)

    fun updateSpending(spending: Spending)
}