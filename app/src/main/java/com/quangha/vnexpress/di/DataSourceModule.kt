package com.quangha.vnexpress.di

import com.quangha.vnexpress.data.entity.source.remote.RemoteDataSource
import org.koin.dsl.module

val dataSourceModule = module {
    factory {
        RemoteDataSource(get())
    }
}