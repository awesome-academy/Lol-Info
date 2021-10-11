package com.sun.lol_info.data.model

data class League(
    val id: String,
    val idSerie: String,
    val name: String,
    val imageUrl: String,
    val teams: MutableList<Team>
)
