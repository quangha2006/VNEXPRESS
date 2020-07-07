package com.quangha.vnexpress.di

import com.quangha.vnexpress.ui.home.MainViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel(get(), AndroidSchedulers.mainThread()) }
}