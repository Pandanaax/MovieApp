package com.eiver.movie.model.Trailer

import com.eiver.movie.model.Movie.Movie
import com.google.gson.annotations.SerializedName
import kotlin.reflect.KFunction1

/*
* Create by Randa {DATE}
*/class GetTrailerResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("results") val trailer: List<Trailer>,
    @SerializedName("total_pages") val pages: Int

)