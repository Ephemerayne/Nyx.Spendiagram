package com.ephemerayne.spendiagram.domain.entity

import org.threeten.bp.LocalDateTime

data class Spending (
    val category: Category,
    val description: String,
    val sum: Double,
    val dateTime: LocalDateTime,
)
