package com.quangha.vnexpress.data.entity.source.remote

import com.quangha.vnexpress.data.entity.response.VersionInfoRes
import io.reactivex.Single
import retrofit2.http.GET

interface AppService {
    @GET("api/androidversion")
    fun getVersionInfo(): Single<VersionInfoRes>
}