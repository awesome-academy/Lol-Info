package com.sun.lol_info.data.model

data class Team(
    val id: String,
    val name: String,
    val image_url: String,
    val location: String,
    val players: MutableList<Player>
)
