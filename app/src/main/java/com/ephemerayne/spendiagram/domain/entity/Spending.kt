package com.ephemerayne.spendiagram.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import org.threeten.bp.Instant
import org.threeten.bp.LocalDateTime
import org.threeten.bp.ZoneOffset

@Entity(tableName = "spendings_table")
data class Spending (
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,

    val category: Category,
    val description: String,
    val sum: Double,
    val dateTime: LocalDateTime,
)

class DateTimeConverter {
    @TypeConverter
    fun toTimeStamp(dateTime: LocalDateTime?): Long? =
        dateTime?.atZone(ZoneOffset.UTC)?.toInstant()?.toEpochMilli()

    @TypeConverter
    fun fromTimestamp(value: Long?): LocalDateTime? =
        value?.let { LocalDateTime.ofInstant(Instant.ofEpochMilli(value), ZoneOffset.UTC) }
}
