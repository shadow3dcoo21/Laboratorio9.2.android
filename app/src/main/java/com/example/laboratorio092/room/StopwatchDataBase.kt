package com.example.laboratorio092.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.laboratorio092.model.Stopwatch

@Database(entities = [Stopwatch::class], version = 1, exportSchema = false)
abstract class StopwatchDataBase :RoomDatabase(){
    abstract fun stopDao() : StopwachDataDao
}