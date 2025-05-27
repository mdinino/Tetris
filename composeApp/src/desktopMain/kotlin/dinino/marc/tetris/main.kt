package dinino.marc.tetris

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import dinino.marc.tetris.di.KoinInitializer

fun main() = application {
    KoinInitializer.init()
    Window(
        onCloseRequest = ::exitApplication,
        title = "Tetris",
    ) {
        App()
    }
}