package dinino.marc.tetris

import androidx.compose.ui.window.ComposeUIViewController
import dinino.marc.tetris.di.KoinInitializer

fun MainViewController() = ComposeUIViewController(
    configure = {
        KoinInitializer.init()
    }
) {
    App()
}