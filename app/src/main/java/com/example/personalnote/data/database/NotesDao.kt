package com.example.personalnote.data.database

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.personalnote.data.Note
import kotlinx.coroutines.flow.Flow

interface NotesDao {
    @Insert
    fun insertNote(note: Note) : Flow<Note>

    @Delete
    fun deleteNote(note: Note) : Flow<Note>

    @Update
    fun updateNote(note: Note) : Flow<Note>

    @Query("SELECT * FROM NOTES_TABLE")
    fun getAllNotes() : Flow<List<Note>>

    @Query("SELECT * FROM Notes_table WHERE category IN (:category) ")
    fun getFilteredNotes(category: String) : Flow<List<Note>>

}