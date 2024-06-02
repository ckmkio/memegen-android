package io.ckmk.memegen.model

import com.squareup.moshi.Json

data class Gif (
    @Json(name = "id") var giphyId: String? = null,
    var title: String? = null
)