package com.example.vivarecife.requests

import com.example.vivarecife.service.IParkService
import com.example.vivarecife.utils.Constants.BASE_URL
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Api {
    private val httpClient = OkHttpClient.Builder()
    private val gson = GsonBuilder().create()
    private var retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    fun getInstance() : IParkService {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        httpClient.addInterceptor(logging)

        return retrofit.create(IParkService::class.java)
    }
}