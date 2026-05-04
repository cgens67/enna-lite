/*
 * Enna Project Original (2026)
 * Kòi Natsuko (github.com/enna)
 * Licensed Under GPL-3.0 | see git history for contributors
 */



package com.enna.music.lite.innertube.models.body

import com.enna.music.lite.innertube.models.Context
import kotlinx.serialization.Serializable

@Serializable
data class CreatePlaylistBody(
    val context: Context,
    val title: String,
    val privacyStatus: String = PrivacyStatus.PRIVATE,
    val videoIds: List<String>? = null
) {
    object PrivacyStatus {
        const val PRIVATE = "PRIVATE"
        const val PUBLIC = "PUBLIC"
        const val UNLISTED = "UNLISTED"
    }
}
