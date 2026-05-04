/*
 * Enna Project Original (2026)
 * Kòi Natsuko (github.com/enna)
 * Licensed Under GPL-3.0 | see git history for contributors
 */



package com.enna.music.lite.db.entities

sealed class LocalItem {
    abstract val id: String
    abstract val title: String
    abstract val thumbnailUrl: String?
}
