package com.sun.lol_info.data.source.remote.utils

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class NetworkUtils {
    companion object{
        fun readContentFromAPI(link: String): String{
            val stringBuilder = StringBuilder()
            try{
                val url = URL(link)
                val urlOpenConnection = url.openConnection() as HttpURLConnection
                val inputStreamReader = InputStreamReader(urlOpenConnection.inputStream)
                val bufferedReader = BufferedReader(inputStreamReader)
                bufferedReader.forEachLine {
                    stringBuilder.append(it)
                }
            }catch (e: IOException){
                e.printStackTrace()
            }
            return stringBuilder.toString()
        }
    }
}
