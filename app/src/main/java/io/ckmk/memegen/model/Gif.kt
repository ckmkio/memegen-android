package io.ckmk.memegen.model

data class Gif (
    var type: String? = null,
    var id: String? = null,
    var url: String? = null,
    var slug: String? = null,
    var bitlyGifUrl: String? = null,
    var bitlyUrl: String? = null,
    var embedUrl: String? = null,
    var username: String? = null,
    var source: String? = null,
    var title: String? = null,
    var rating: String? = null,
    var contentUrl: String? = null,
    var sourceTld: String? = null,
    var sourcePostUrl: String? = null,
    var isSticker: Int? = null,
    var importDatetime: String? = null,
    var trendingDatetime: String? = null,
    var images: Images? = Images(),
    var user: User? = User(),
    var analyticsResponsePayload: String? = null,
    var analytics: Analytics? = Analytics(),
    var altText: String? = null
)