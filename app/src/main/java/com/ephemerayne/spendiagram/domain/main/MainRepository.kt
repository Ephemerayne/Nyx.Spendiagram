package com.ephemerayne.spendiagram.domain.main

import com.ephemerayne.spendiagram.domain.entity.Spending

interface MainRepository {

    fun getSpendings(): List<Spending>
}