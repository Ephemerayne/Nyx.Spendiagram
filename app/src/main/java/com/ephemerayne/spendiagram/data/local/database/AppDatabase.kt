package com.ephemerayne.spendiagram.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.ephemerayne.spendiagram.data.local.SpendingDaoRoomImpl
import com.ephemerayne.spendiagram.domain.entity.Spending

@Database(entities = [
    Spending::class,
], version = 1)

@TypeConverters(TypeConverter::class)
abstract class AppDatabase: RoomDatabase() {

    abstract fun spendingsDao(): SpendingDaoRoomImpl
}