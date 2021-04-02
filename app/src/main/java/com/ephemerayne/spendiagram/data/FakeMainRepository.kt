package com.ephemerayne.spendiagram.data

import com.ephemerayne.spendiagram.domain.entity.Category
import com.ephemerayne.spendiagram.domain.entity.Spending
import com.ephemerayne.spendiagram.domain.main.MainRepository
import org.threeten.bp.LocalDateTime

class FakeMainRepository : MainRepository {

    override fun getSpendings(): List<Spending> {
        return listOf(
            Spending(
                category = Category(0, "АОЛПОПО", 0),
                description = "ПРОЛД",
                sum = 2345.0,
                dateTime = LocalDateTime.now()
            ),
            Spending(
                category = Category(1, "2", 0),
                description = "aaa",
                sum = 2345.0,
                dateTime = LocalDateTime.now()
            ),
            Spending(
                category = Category(2, "3", 0),
                description = "erere",
                sum = 2345.0,
                dateTime = LocalDateTime.now()
            ),
        )
    }
}