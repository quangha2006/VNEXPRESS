package com.quangha.vnexpress.data.entity.response

import com.google.gson.annotations.SerializedName

open class BaseResponse(
    @SerializedName("status")
    var status: Int? = -1,
    @SerializedName("message")
    var message: String? = null
)