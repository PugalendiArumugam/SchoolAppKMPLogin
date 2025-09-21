package com.ramjetsoftware.schoolappkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform