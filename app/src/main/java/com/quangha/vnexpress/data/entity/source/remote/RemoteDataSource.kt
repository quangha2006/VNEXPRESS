package com.quangha.vnexpress.data.entity.source.remote

import com.quangha.vnexpress.data.entity.response.VersionInfoRes
import com.quangha.vnexpress.data.entity.source.DataSource
import io.reactivex.Single

class RemoteDataSource(private val appService: AppService) :
    DataSource {
    override fun getVersionInfo(): Single<VersionInfoRes> {
        return appService.getVersionInfo()
    }
}