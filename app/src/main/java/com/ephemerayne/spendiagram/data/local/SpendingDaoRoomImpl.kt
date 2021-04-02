package com.ephemerayne.spendiagram.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ephemerayne.spendiagram.domain.entity.Spending

@Dao
interface SpendingDaoRoomImpl {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSpending(spending: Spending)

    @Query("SELECT * FROM spendings_table WHERE id=:id LIMIT 1")
    fun getSpending(id: Int): LiveData<Spending>

    @Query("SELECT * FROM spendings_table")
    fun getAllSpendings(): LiveData<List<Spending>>

    @Query("DELETE FROM spendings_table WHERE id=:id")
    fun deleteSpending(id: Int)

    @Update
    fun updateSpending(spending: Spending)
}