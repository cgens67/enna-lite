/*
 * Enna Project Original (2026)
 * Kòi Natsuko (github.com/enna)
 * Licensed Under GPL-3.0 | see git history for contributors
 */

package com.enna.music.lite.canvas

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

object EnnaCanvas {
    suspend fun getBySongArtist(
        song: String,
        artist: String,
        storefront: String = "us",
    ): CanvasArtwork? {
        return null
    }

    suspend fun getByAlbumId(albumId: String): CanvasArtwork? {
        return null
    }

    suspend fun getByAlbumUrl(url: String): CanvasArtwork? {
        return null
    }

    suspend fun isHealthy(): Boolean {
        return false
    }
}

@Serializable
data class CanvasArtwork(
    val name: String? = null,
    val artist: String? = null,
    @SerialName("albumId")
    val albumId: String? = null,
    val static: String? = null,
    val animated: String? = null,
    val videoUrl: String? = null,
) {
    val preferredAnimationUrl: String?
        get() = animated ?: videoUrl
}
