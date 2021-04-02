package com.ephemerayne.spendiagram.domain.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ephemerayne.spendiagram.domain.entity.Category
import com.ephemerayne.spendiagram.domain.entity.Spending
import org.threeten.bp.LocalDateTime
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(): ViewModel() {
    val testLiveData = MutableLiveData<List<Spending>>().apply {
        value = listOf(
            Spending(
                category = Category(0,"1", 0),
                description = "ggggg",
                sum = 2345.0,
                dateTime = LocalDateTime.now()
            ),
            Spending(
                category = Category(1,"2", 0),
                description = "aaa",
                sum = 2345.0,
                dateTime = LocalDateTime.now()
            ),
            Spending(
                category = Category(2,"3", 0),
                description = "erere",
                sum = 2345.0,
                dateTime = LocalDateTime.now()
            ),
        )
    }
}