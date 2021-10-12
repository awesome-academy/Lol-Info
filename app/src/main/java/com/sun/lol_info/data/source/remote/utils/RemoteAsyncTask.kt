package com.sun.lol_info.data.source.remote.utils

import android.os.AsyncTask

class RemoteAsyncTask<T>(
    private val callback: OnDataCallback<T>,
    private val handle: () -> T
) : AsyncTask<Unit, Unit, T?>() {

    private var exception: Exception? = null
    override fun doInBackground(vararg p0: Unit?): T? =
        try {
            handle()
        } catch (e: Exception) {
            exception = e
            null
        }

    override fun onPostExecute(result: T?) {
        super.onPostExecute(result)
        result?.let { callback.onSuccess(it) } ?: callback.onFail(exception)
    }
}
