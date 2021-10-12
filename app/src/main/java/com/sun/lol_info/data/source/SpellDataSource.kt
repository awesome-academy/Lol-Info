package com.sun.lol_info.data.source

import com.sun.lol_info.data.model.Spell
import com.sun.lol_info.data.source.remote.utils.OnDataCallback

interface SpellDataSource {
    fun getSpell(callback: OnDataCallback<List<Spell>>)
}
