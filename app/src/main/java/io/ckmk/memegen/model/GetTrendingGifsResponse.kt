package io.ckmk.memegen.model

data class GetTrendingGifsResponse(

    var data: List<Gif> = arrayListOf(),
    var meta: Meta? = Meta(),
    var pagination: Pagination? = Pagination()
)