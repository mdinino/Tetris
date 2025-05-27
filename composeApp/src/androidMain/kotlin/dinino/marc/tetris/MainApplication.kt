package dinino.marc.tetris

import android.app.Application
import dinino.marc.tetris.di.KoinInitializer

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        KoinInitializer.init()
    }
}