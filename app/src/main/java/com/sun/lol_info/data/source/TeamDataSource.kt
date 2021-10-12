package com.sun.lol_info.data.source

import com.sun.lol_info.data.model.Team
import com.sun.lol_info.data.source.remote.utils.OnDataCallback

interface TeamDataSource {
    fun getTeam(callback: OnDataCallback<List<Team>>)
}
