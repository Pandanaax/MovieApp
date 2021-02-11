package com.eiver.movie.model

import com.google.gson.annotations.SerializedName

/*
* Create by Randa {DATE}
*/class GetMoviesResponse (
    @SerializedName("page") val page: Int,
    @SerializedName("results") val movies: List<Movie>,
    @SerializedName("total_pages") val pages: Int

)