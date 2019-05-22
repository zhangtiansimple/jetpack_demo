package com.study.jetpacktest.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Girl(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String
)