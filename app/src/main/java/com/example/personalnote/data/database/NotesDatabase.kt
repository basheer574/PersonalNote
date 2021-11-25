package com.example.personalnote.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.personalnote.data.Note
import com.example.personalnote.utils.Constants

@Database(entities = [Note::class], version = Constants.VERSION)
abstract class NotesDatabase : RoomDatabase() {

    companion object{
        private const val databaseName = Constants.DATABASE_NAME

        @Volatile
        private var instance: NotesDatabase? = null

        fun getInstance(context: Context) : NotesDatabase{
            return instance ?: synchronized(this) { buildDatabase(context).also { instance = it } }
        }

        private fun buildDatabase(context: Context): NotesDatabase {
            return Room.databaseBuilder(context, NotesDatabase::class.java, databaseName)
                .build()
        }
    }
}