package com.example.myapplication


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Interv::class), version = 1)
abstract class DataBase :RoomDatabase(){
    abstract fun IntervDAO(): IntervDAO
    companion object {
        private var instance: DataBase? = null

        fun getInstance(context: Context):DataBase? {
            if (instance == null) {

                instance = Room.databaseBuilder(context.getApplicationContext(),
                    DataBase::class.java, "produit.db")
                    .build()

            }
            return instance
        }

        fun destroyInstance() {
            instance = null
        }
    }

    }



