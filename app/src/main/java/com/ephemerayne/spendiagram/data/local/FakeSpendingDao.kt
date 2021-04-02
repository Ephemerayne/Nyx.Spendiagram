package com.ephemerayne.spendiagram.data.local

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ephemerayne.spendiagram.domain.entity.Category
import com.ephemerayne.spendiagram.domain.entity.Spending
import org.threeten.bp.LocalDateTime
import javax.inject.Inject

class FakeSpendingDao @Inject constructor(): SpendingDao {

    override fun insertSpending(spending: Spending) {

    }

    override fun getSpending(id: Int): LiveData<Spending> {
       return MutableLiveData()
    }

    override fun getAllSpendings(): LiveData<List<Spending>> {
        return MutableLiveData<List<Spending>>().apply {
            value = listOf(
                Spending(
                    category = Category(0, "FakeSpendingDao: АОЛПОПО", 0),
                    description = "FakeSpendingDao: ПРОЛД",
                    sum = 2345.0,
                    dateTime = LocalDateTime.now()
                ),
                Spending(
                    category = Category(1, "2", 0),
                    description = "FakeSpendingDao: aafdfgdfgdfga",
                    sum = 2345.0,
                    dateTime = LocalDateTime.now()
                ),
                Spending(
                    category = Category(2, "3", 0),
                    description = "FakeSpendingDao: erere",
                    sum = 2345.0,
                    dateTime = LocalDateTime.now()
                ),
            )
        }
    }

    override fun deleteSpending(id: Int) {

    }

    override fun updateSpending(spending: Spending) {

    }
}