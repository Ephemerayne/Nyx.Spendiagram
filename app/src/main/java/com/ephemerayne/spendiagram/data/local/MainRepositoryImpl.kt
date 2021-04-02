package com.ephemerayne.spendiagram.data.local

import androidx.lifecycle.LiveData
import com.ephemerayne.spendiagram.domain.entity.Spending
import com.ephemerayne.spendiagram.domain.main.MainRepository
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val dao: SpendingDao
) : MainRepository {

    override fun getSpendings(): LiveData<List<Spending>> = dao.getAllSpendings()

}