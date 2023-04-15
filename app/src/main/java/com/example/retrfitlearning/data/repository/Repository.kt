package com.example.retrfitlearning.data.repository

import com.example.retrfitlearning.data.api.RetrofitInstance
import com.example.retrfitlearning.model.beznal.Beznalichka
import com.example.retrfitlearning.model.beznal.BeznalichkaItem
import com.example.retrfitlearning.model.nal.Nalichka
import com.example.retrfitlearning.model.nal.NalichkaItem
import retrofit2.Response

class Repository {

    suspend fun getNalichka(): Response<Nalichka>{
        return RetrofitInstance.api.getNal()
    }

    suspend fun getBeznalichka(): Response<Beznalichka>{
        return RetrofitInstance.api.getBeznal()
    }

}