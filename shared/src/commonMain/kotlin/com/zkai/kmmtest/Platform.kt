package com.zkai.kmmtest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform