package com.eiver.movie.api

import com.eiver.movie.model.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/*
* Create by Randa {DATE}
*/
interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "05c8d1167eb969eb35bfb3bf9bc86315",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}