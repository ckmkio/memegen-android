package io.ckmk.memegen.model

data class Images(

    var image: Image? = Image(),
    var fixedHeight: Image? = Image(),
    var fixedHeightDownsampled: Image? = Image(),
    var fixedHeightSmall: Image? = Image(),
    var fixedWidth: Image? = Image(),
    var fixedWidthDownsampled: Image? = Image(),
    var fixedWidthSmall: Image? = Image()
)