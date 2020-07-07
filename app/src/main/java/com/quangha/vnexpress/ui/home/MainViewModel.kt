package com.quangha.vnexpress.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.quangha.vnexpress.base.BaseViewModel
import com.quangha.vnexpress.data.entity.response.VersionInfoRes
import com.quangha.vnexpress.domain.MainUseCase
import com.quangha.vnexpress.utils.extensions.addTo
import io.reactivex.Scheduler

class MainViewModel(private val mainUseCase: MainUseCase, private val scheduler: Scheduler) :
    BaseViewModel() {

    private val _androidVersionInfo = MutableLiveData<VersionInfoRes>()
    val androidVersionInfo: LiveData<VersionInfoRes> = _androidVersionInfo


    fun getAndroidVersionInfo() {
        mainUseCase.getVersionInfo()
            .observeOn(scheduler)
            .doOnSubscribe { showLoading(true) }
            .doAfterTerminate { showLoading(false) }
            .subscribe({
                if (!it.android.isNullOrEmpty()) {
                    _androidVersionInfo.value = it
                } else {
                    showError(it)
                }
            }, {
                showFailure(it)
            })
            .addTo(getCompositeDisposable())
    }
}