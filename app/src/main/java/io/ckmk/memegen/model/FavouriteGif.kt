package io.ckmk.memegen.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FavouriteGif (

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var giphyId: String? = null,
    var title: String? = null
)