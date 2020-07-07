package com.quangha.vnexpress.di

import com.quangha.vnexpress.domain.MainUseCase
import com.quangha.vnexpress.domain.MainUserCaseIml
import org.koin.dsl.module

val useCaseModule = module {
    factory<MainUseCase> {
        MainUserCaseIml(get())
    }
}