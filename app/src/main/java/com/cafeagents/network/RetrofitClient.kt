package com.cafeagents.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.cafeagents.utils.Constants

object RetrofitClient {
    private var retrofit: Retrofit? = null

    private fun getClient(): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }

    val apiService: ApiService by lazy {
        getClient().create(ApiService::class.java)
    }
}
