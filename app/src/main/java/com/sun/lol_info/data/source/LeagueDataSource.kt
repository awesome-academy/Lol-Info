package com.sun.lol_info.data.source

import com.sun.lol_info.data.model.League
import com.sun.lol_info.data.source.remote.utils.OnDataCallback

interface LeagueDataSource {
    fun getLeague(callback: OnDataCallback<List<League>>)
}
