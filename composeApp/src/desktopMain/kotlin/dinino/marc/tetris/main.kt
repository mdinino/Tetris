package dinino.marc.tetris

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import dinino.marc.tetris.di.KoinInitializer
import org.jetbrains.compose.resources.stringResource
import tetris.composeapp.generated.resources.Res
import tetris.composeapp.generated.resources.app_name

fun main() = application {
    KoinInitializer.init()
    Window(
        onCloseRequest = ::exitApplication,
        title = stringResource(Res.string.app_name),
    ) {
        App()
    }
}