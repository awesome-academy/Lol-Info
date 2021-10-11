package com.sun.lol_info.data.model

data class Champion(
    val id: String,
    val name: String,
    val title: String,
    val imageName: String,
    val skins: MutableList<Skin>,
    val lore: String,
    val blurb: String,
    val tags: MutableList<String>,
    val stats: Stats,
    val skills: MutableList<Skill>,
    val passive: Passive
)
