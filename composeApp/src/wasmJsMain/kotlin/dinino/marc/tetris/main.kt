package dinino.marc.tetris

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import dinino.marc.tetris.di.KoinInitializer
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    KoinInitializer.init()
    ComposeViewport(document.body!!) {
        App()
    }
}