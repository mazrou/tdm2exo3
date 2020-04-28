package com.e.noteapplication.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {

    @Insert
    fun insert(note : Note)
    @Update
    fun update(note:Note)

    @Delete
    fun delete(note : Note)

    @Query("SELECT * FROM note ORDER BY date DESC")
    fun getAll() : MutableList<Note>

}