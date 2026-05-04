/*
 * Enna Project Original (2026)
 * Kòi Natsuko (github.com/enna)
 * Licensed Under GPL-3.0 | see git history for contributors
 */



package com.enna.music.lite.innertube.models

import kotlinx.serialization.Serializable

@Serializable
data class Button(
    val buttonRenderer: ButtonRenderer,
) {
    @Serializable
    data class ButtonRenderer(
        val text: Runs,
        val navigationEndpoint: NavigationEndpoint?,
        val command: NavigationEndpoint?,
        val icon: Icon?,
    )
}
