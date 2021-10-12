package com.sun.lol_info.data.source.remote.utils

interface OnDataCallback<T> {
    fun onSuccess(data: T)
    fun onFail(exception: Exception?)
}
