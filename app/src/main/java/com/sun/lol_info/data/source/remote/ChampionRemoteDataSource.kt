package com.sun.lol_info.data.source.remote

import com.sun.lol_info.data.model.Champion
import com.sun.lol_info.data.source.ChampionDataSource
import com.sun.lol_info.data.source.remote.utils.OnDataCallback

class ChampionRemoteDataSource : ChampionDataSource.Remote {
    override fun getChampion(callback: OnDataCallback<List<Champion>>) {

    }
}
