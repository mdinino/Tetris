package dinino.marc.tetris.di

import dinino.marc.tetris.ui.screen.game.GameScreenViewModel
import dinino.marc.tetris.ui.screen.pauseandgameover.PauseAndGameOverScreenViewModel
import dinino.marc.tetris.ui.screen.select.SelectScreenViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { SelectScreenViewModel() }
    viewModel { GameScreenViewModel() }
    viewModel { PauseAndGameOverScreenViewModel() }
}