package io.ckmk.memegen.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import io.ckmk.memegen.model.FavouriteGif

@Dao
interface FavouriteGifDao {
    @Query("SELECT * FROM favouritegif")
    fun getAll(): List<FavouriteGif>

    @Insert
    fun insertAll(vararg favouriteGifs: FavouriteGif)

    @Delete
    fun delete(favouriteGif: FavouriteGif)
}