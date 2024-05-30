package io.ckmk.memegen.model

data class Pagination(

    var totalCount: Int? = null,
    var count: Int? = null,
    var offset: Int? = null
)