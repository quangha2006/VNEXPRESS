package com.quangha.vnexpress.data.entity.source

import com.quangha.vnexpress.data.entity.response.VersionInfoRes
import io.reactivex.Single

interface DataSource {
    fun getVersionInfo(): Single<VersionInfoRes>
}