package io.ckmk.memegen.model

data class User(

    var avatarUrl: String? = null,
    var bannerImage: String? = null,
    var bannerUrl: String? = null,
    var profileUrl: String? = null,
    var username: String? = null,
    var displayName: String? = null,
    var description: String? = null,
    var instagramUrl: String? = null,
    var websiteUrl: String? = null,
    var isVerified: Boolean? = null
)