package com.example.helloworld.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [AccountEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AccountDatabase: RoomDatabase() {
    abstract fun accountDao(): AccountDao
}