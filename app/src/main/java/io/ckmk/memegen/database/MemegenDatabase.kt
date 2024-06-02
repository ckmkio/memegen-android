package io.ckmk.memegen.database

import androidx.room.Database
import androidx.room.RoomDatabase
import io.ckmk.memegen.model.FavouriteGif

@Database(entities = [FavouriteGif::class], version = 1)
abstract class MemegenDatabase : RoomDatabase() {
    abstract fun favouriteGifDao(): FavouriteGifDao
}