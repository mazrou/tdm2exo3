package com.e.noteapplication.repository


import com.e.noteapplication.data.Note
import com.e.noteapplication.data.NoteDataBase
import android.app.Application
import android.content.Context
import com.e.noteapplication.data.NoteDao

class NoteRepository(
    context: Context
) {

    private var dataBase: NoteDataBase = NoteDataBase(context)
    private var dao: NoteDao = dataBase.noteDao()

    fun insert(note : Note){
        dao.insert(note)
    }

    fun delete(note : Note){
        dao.delete(note)
    }

    fun getAllNote() : MutableList<Note>{
        return dao.getAll()
    }

    fun update(note : Note){
        dao.update(note)
    }
}