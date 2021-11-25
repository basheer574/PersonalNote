package com.example.personalnote.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.personalnote.utils.Constants

@Entity(tableName = Constants.TABLE_NAME)
data class Note (
    @PrimaryKey(autoGenerate = true) val id: Long?,
    val title: String?,
    val content: String?,
    val category: String?
)