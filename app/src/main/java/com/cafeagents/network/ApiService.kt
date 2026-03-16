package com.cafeagents.network

import retrofit2.http.GET

interface ApiService {
    // TODO: Define API endpoints
    @GET("health")
    suspend fun checkHealth(): String
}
