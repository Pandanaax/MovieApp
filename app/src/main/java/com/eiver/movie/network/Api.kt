package com.eiver.movie.network

import com.eiver.movie.model.Movie.GetMoviesResponse
import com.eiver.movie.model.Trailer.GetTrailerResponse
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

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "05c8d1167eb969eb35bfb3bf9bc86315",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("/movie/{movie_id}/videos")
    fun getTrailerMovies(
        @Query("api_key") apiKey: String = "05c8d1167eb969eb35bfb3bf9bc86315",
        @Query("page") page: Int
    ): Call<GetTrailerResponse>

}