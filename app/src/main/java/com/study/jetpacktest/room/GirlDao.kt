package com.study.jetpacktest.room

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface GirlDao {
    @Query("SELECT * FROM Girl ORDER BY name COLLATE NOCASE ASC")
    fun getAllGirl(): DataSource.Factory<Int, Girl>

    @Insert
    fun insert(students: List<Girl>)
}