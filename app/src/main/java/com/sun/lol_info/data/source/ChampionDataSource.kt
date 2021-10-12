package com.sun.lol_info.data.source

import com.sun.lol_info.data.model.Champion
import com.sun.lol_info.data.source.remote.utils.OnDataCallback

interface ChampionDataSource {
    interface Remote {
        fun getChampion(callback: OnDataCallback<List<Champion>>)
    }
}
