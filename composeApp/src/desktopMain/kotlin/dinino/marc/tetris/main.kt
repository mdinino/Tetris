package dinino.marc.tetris

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import dinino.marc.tetris.ui.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Tetris",
    ) {
        App()
    }
}