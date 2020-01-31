package com.example.vivarecife.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.vivarecife.data.entities.User

@Database(entities = [User::class], version = 1)
abstract class RoomManager : RoomDatabase() {

    abstract fun getCityDao() : CityDao

    companion object {
        var INSTANCE : RoomManager? = null

        fun getInstance(context: Context) : RoomManager? {
            synchronized(RoomManager::class.java) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        RoomManager::class.java,
                        "VivaRecife.db")
                        .build()
                }
                return INSTANCE
            }
        }
    }
}