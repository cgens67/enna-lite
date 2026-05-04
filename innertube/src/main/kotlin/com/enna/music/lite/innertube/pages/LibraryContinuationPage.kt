/*
 * Enna Project Original (2026)
 * Kòi Natsuko (github.com/enna)
 * Licensed Under GPL-3.0 | see git history for contributors
 */



package com.enna.music.lite.innertube.pages

import com.enna.music.lite.innertube.models.YTItem

data class LibraryContinuationPage(
    val items: List<YTItem>,
    val continuation: String?,
)
