package com.quangha.vnexpress

import android.app.Application
import com.quangha.vnexpress.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class QHApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    private fun initKoin() {
        startKoin {
            androidContext(applicationContext)
            modules(
                apiModule,
                dataSourceModule,
                networkModule,
                repositoryModule,
                useCaseModule,
                viewModelModule
            )
        }
    }

}