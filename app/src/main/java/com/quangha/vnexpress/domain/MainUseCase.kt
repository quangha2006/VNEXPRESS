package com.quangha.vnexpress.domain

import com.quangha.vnexpress.data.entity.response.VersionInfoRes
import com.quangha.vnexpress.data.entity.source.ApiRepository
import io.reactivex.Single

interface MainUseCase {
    fun getVersionInfo(): Single<VersionInfoRes>
}

class MainUserCaseIml(private val apiRepository: ApiRepository) : MainUseCase {
    override fun getVersionInfo(): Single<VersionInfoRes> {
        return apiRepository.getVersionInfo()
    }
}