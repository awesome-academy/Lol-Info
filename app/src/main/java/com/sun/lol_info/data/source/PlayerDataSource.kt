package com.sun.lol_info.data.source

import com.sun.lol_info.data.model.Player
import com.sun.lol_info.data.source.remote.utils.OnDataCallback

interface PlayerDataSource {
    fun getPlayer(callback: OnDataCallback<List<Player>>)
}
