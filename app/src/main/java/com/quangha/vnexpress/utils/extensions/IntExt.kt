package com.quangha.vnexpress.utils.extensions

fun Int?.isSuccess() = this == 1

fun Int?.isError() = this != 1
