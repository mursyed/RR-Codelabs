package com.mursitaffandi.rrcodelabs.rest

import com.mursitaffandi.rrcodelabs.model.Leagues
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.GET

interface ApiService {
    @GET("all_leagues.php")
    fun getAllLeague(
    ) : Observable<Leagues>

}