package com.ephemerayne.spendiagram.domain.entity

import org.threeten.bp.LocalDateTime

data class Spending (
    var id: Int? = null,
    val category: Category,
    val description: String,
    val sum: Double,
    val dateTime: LocalDateTime,
)
