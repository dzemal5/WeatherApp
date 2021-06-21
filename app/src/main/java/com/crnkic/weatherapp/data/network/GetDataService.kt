package com.crnkic.weatherapp.data.network

import com.crnkic.weatherapp.data.model.ForecastContainer
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataService {
//    @GET("daily?days=14&postal_code=17055&country=US&key=69c331eb3c2c440382c93901d4be55bd")
//    fun getWeatherData(): Call<ForecastContainer>

    @GET("daily")
    fun getWeatherData(
            @Query("days") days: String,
            @Query("postal_code") postal_code: String,
            @Query("country") country: String,
            @Query("units") units: String,
            @Query("key") key: String
    ): Call<ForecastContainer>

}