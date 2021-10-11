package com.sun.lol_info.data.datasource.remote.api

import android.net.Uri
import com.sun.lol_info.utils.Character
import com.sun.lol_info.utils.Extension

object ApiQuery {

    /**
     * Riot API
     */

    private fun createRiotBaseUri() = Uri.Builder()
        .scheme(ApiConstants.SCHEME_HTTPS)
        .authority(ApiConstants.AUTHORITY_RIOT_API)
        .appendPath(ApiConstants.CDN)

    fun queryAllChampions() = createRiotBaseUri()
        .appendPath(ApiConstants.CONTENT_VERSION)
        .appendPath(ApiConstants.DATA)
        .appendPath(ApiConstants.EN_US)
        .appendPath(ApiConstants.CHAMPION + Character.DOT + Extension.JSON)
        .toString()

    fun queryChampion(idChampion: String) = createRiotBaseUri()
        .appendPath(ApiConstants.CONTENT_VERSION)
        .appendPath(ApiConstants.DATA)
        .appendPath(ApiConstants.EN_US)
        .appendPath(ApiConstants.CHAMPION)
        .appendPath(idChampion + Character.DOT + Extension.JSON)
        .toString()

    fun queryChampionImage(imageName: String) = createRiotBaseUri()
        .appendPath(ApiConstants.CONTENT_VERSION)
        .appendPath(ApiConstants.IMG)
        .appendPath(ApiConstants.CHAMPION)
        .appendPath(imageName)
        .toString()

    fun querySkinChampionImage(idChampion: String, numSkin: String) = createRiotBaseUri()
        .appendPath(ApiConstants.IMG)
        .appendPath(ApiConstants.CHAMPION)
        .appendPath(ApiConstants.SPLASH)
        .appendPath(idChampion + Character.UNDERSCORE + numSkin + Extension.JPG)
        .toString()

    fun queryPassiveImage(imageName: String) = createRiotBaseUri()
        .appendPath(ApiConstants.CONTENT_VERSION)
        .appendPath(ApiConstants.IMG)
        .appendPath(ApiConstants.PASSIVE)
        .appendPath(imageName)
        .toString()

    fun querySkillChampionImage(imageName: String) = createRiotBaseUri()
        .appendPath(ApiConstants.CONTENT_VERSION)
        .appendPath(ApiConstants.IMG)
        .appendPath(ApiConstants.SPELL)
        .appendPath(imageName)
        .toString()

    fun queryAllItems() = createRiotBaseUri()
        .appendPath(ApiConstants.CONTENT_VERSION)
        .appendPath(ApiConstants.DATA)
        .appendPath(ApiConstants.EN_US)
        .appendPath(ApiConstants.ITEM + Character.DOT + Extension.JSON)
        .toString()

    fun queryImageItem(imageName: String) = createRiotBaseUri()
        .appendPath(ApiConstants.CONTENT_VERSION)
        .appendPath(ApiConstants.IMG)
        .appendPath(ApiConstants.ITEM)
        .appendPath(imageName)
        .toString()

    fun queryAllSpells() = createRiotBaseUri()
        .appendPath(ApiConstants.CONTENT_VERSION)
        .appendPath(ApiConstants.DATA)
        .appendPath(ApiConstants.EN_US)
        .appendPath(ApiConstants.SUMMONER + Character.DOT + Extension.JSON)
        .toString()

    fun querySpellImage(imageName: String) = createRiotBaseUri()
        .appendPath(ApiConstants.CONTENT_VERSION)
        .appendPath(ApiConstants.IMG)
        .appendPath(ApiConstants.SPELL)
        .appendPath(imageName)
        .toString()

    /**
     * Pandas API
     */

    private fun createPandasBaseUri() = Uri.Builder()
        .scheme(ApiConstants.SCHEME_HTTPS)
        .authority(ApiConstants.AUTHORITY_PANDAS_API)

    fun queryAllLeagues() = createPandasBaseUri()
        .appendPath(ApiConstants.LOL)
        .appendPath(ApiConstants.LEAGUES)
        .toString()

    fun queryAllTeamsInLeague(idSerie: String) = createPandasBaseUri()
        .appendPath(ApiConstants.LOL)
        .appendPath(ApiConstants.SERIES)
        .appendPath(idSerie)
        .appendPath(ApiConstants.TEAMS)
        .toString()

    fun queryAllTeams() = createPandasBaseUri()
        .appendPath(ApiConstants.LOL)
        .appendPath(ApiConstants.TEAMS)
        .toString()

    fun queryAllPlayers() = createPandasBaseUri()
        .appendPath(ApiConstants.LOL)
        .appendPath(ApiConstants.PLAYERS)
        .toString()
}
