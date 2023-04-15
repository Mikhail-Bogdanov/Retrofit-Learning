package com.example.retrfitlearning.data.api

import com.example.retrfitlearning.model.beznal.Beznalichka
import com.example.retrfitlearning.model.beznal.BeznalichkaItem
import com.example.retrfitlearning.model.nal.Nalichka
import com.example.retrfitlearning.model.nal.NalichkaItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNal(): Response<Nalichka>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznal(): Response<Beznalichka>

}