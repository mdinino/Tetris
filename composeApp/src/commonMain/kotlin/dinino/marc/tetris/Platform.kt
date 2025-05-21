package dinino.marc.tetris

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform