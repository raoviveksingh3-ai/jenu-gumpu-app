package com.jenugumpu.app.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.jenugumpu.app.data.local.entity.HarvestLogEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface HarvestLogDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHarvestLog(log: HarvestLogEntity)

    @Update
    suspend fun updateHarvestLog(log: HarvestLogEntity)

    @Delete
    suspend fun deleteHarvestLog(log: HarvestLogEntity)

    @Query("SELECT * FROM harvest_logs WHERE id = :logId")
    fun getHarvestLogById(logId: Long): Flow<HarvestLogEntity?>

    @Query("SELECT * FROM harvest_logs WHERE userId = :userId ORDER BY harvestDate DESC")
    fun getHarvestLogsByUserId(userId: String): Flow<List<HarvestLogEntity>>

    @Query("SELECT * FROM harvest_logs WHERE batchId = :batchId")
    fun getHarvestLogsByBatchId(batchId: String): Flow<List<HarvestLogEntity>>

    @Query("SELECT * FROM harvest_logs WHERE isSynced = 0")
    fun getUnsyncedLogs(): Flow<List<HarvestLogEntity>>

    @Query("SELECT SUM(quantity) FROM harvest_logs WHERE userId = :userId")
    fun getUserTotalHarvestedKg(userId: String): Flow<Double?>

    @Query("SELECT SUM(quantity) FROM harvest_logs")
    fun getCollectiveStockKg(): Flow<Double?>

    @Query("SELECT * FROM harvest_logs ORDER BY harvestDate DESC LIMIT :limit OFFSET :offset")
    fun getHarvestLogsPaginated(limit: Int, offset: Int): Flow<List<HarvestLogEntity>>

    @Query("DELETE FROM harvest_logs WHERE userId = :userId")
    suspend fun deleteUserLogs(userId: String)
}