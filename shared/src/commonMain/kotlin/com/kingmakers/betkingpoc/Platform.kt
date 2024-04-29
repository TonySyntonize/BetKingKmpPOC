package com.kingmakers.betkingpoc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform