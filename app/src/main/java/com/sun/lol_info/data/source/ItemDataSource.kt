package com.sun.lol_info.data.source

import com.sun.lol_info.data.model.Item
import com.sun.lol_info.data.source.remote.utils.OnDataCallback

interface ItemDataSource {
    fun getItem(callback: OnDataCallback<List<Item>>)
}
