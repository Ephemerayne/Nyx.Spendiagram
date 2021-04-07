package com.ephemerayne.spendiagram.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ephemerayne.spendiagram.domain.entity.Spending

@Dao
interface SpendingDaoRoomImpl: SpendingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override fun insertSpending(spending: Spending)

    @Query("SELECT * FROM spendings_table WHERE id=:id LIMIT 1")
    override fun getSpending(id: Int): LiveData<Spending>

    @Query("SELECT * FROM spendings_table")
    override fun getAllSpendings(): LiveData<List<Spending>>

    @Query("DELETE FROM spendings_table WHERE id=:id")
    override fun deleteSpending(id: Int)

    @Update
    override fun updateSpending(spending: Spending)
}