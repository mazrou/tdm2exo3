package com.e.noteapplication.data

import android.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
import kotlin.properties.Delegates

@Entity(tableName = "note")
class Note (
    @PrimaryKey(autoGenerate = false)
    val title : String,
    val content: String,
    val date : String ,
    val color : String
){

}
