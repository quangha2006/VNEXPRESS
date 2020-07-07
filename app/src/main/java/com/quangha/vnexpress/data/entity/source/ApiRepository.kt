package com.quangha.vnexpress.data.entity.source

import com.quangha.vnexpress.data.entity.response.VersionInfoRes
import com.quangha.vnexpress.data.entity.source.remote.RemoteDataSource
import io.reactivex.Scheduler
import io.reactivex.Single

class ApiRepository(
    private val remoteDataSource: RemoteDataSource,
    private val scheduler: Scheduler
) : DataSource {
    override fun getVersionInfo(): Single<VersionInfoRes> {
        return remoteDataSource.getVersionInfo().subscribeOn(scheduler)
    }
}