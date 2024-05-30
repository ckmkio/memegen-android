package io.ckmk.memegen.model

data class Analytics(

    var onload: Onload? = Onload(),
    var onclick: Onclick? = Onclick(),
    var onsent: Onsent? = Onsent()
)