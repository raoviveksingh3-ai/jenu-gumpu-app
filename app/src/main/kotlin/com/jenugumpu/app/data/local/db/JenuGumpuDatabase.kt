package com.jenugumpu.app.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jenugumpu.app.data.local.dao.HarvestLogDao
import com.jenugumpu.app.data.local.dao.UserDao
import com.jenugumpu.app.data.local.entity.HarvestLogEntity
import com.jenugumpu.app.data.local.entity.UserEntity

@Database(
    entities = [
        UserEntity::class,
        HarvestLogEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class JenuGumpuDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun harvestLogDao(): HarvestLogDao
}