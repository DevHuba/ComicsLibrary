package com.example.comicslibrary.model.api

import com.example.comicslibrary.BuildConfig
import retrofit2.Retrofit

object ApiService {
    private const val BASE_URL = "http://gateway.marvel.com/v1/public/"

    private fun getRetrofit(): Retrofit {
        val timeStamp = System.currentTimeMillis().toString()
        val apiSecret = BuildConfig.MARVEL_SECRET
        val apiKey = BuildConfig.MARVEL_KEY
        val hash =

    }
}