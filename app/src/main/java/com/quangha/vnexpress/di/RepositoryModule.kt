package com.quangha.vnexpress.di

import com.quangha.vnexpress.data.entity.source.ApiRepository
import io.reactivex.schedulers.Schedulers
import org.koin.dsl.module


val repositoryModule = module {
    factory {
        ApiRepository(get(), Schedulers.io())
    }
}