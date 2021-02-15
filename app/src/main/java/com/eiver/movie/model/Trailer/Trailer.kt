package com.eiver.movie.model.Trailer

import com.google.gson.annotations.SerializedName

/*
* Create by Randa {DATE}
*/
data class Trailer(
    @SerializedName("id") val id: Long,
    @SerializedName("iso_639_1") val iso1: String,
    @SerializedName("iso_3166_1") val iso2: String,
    @SerializedName("key") val keyPath: String,
    @SerializedName("name") val name: String,
    @SerializedName("site") val site: String,
    @SerializedName("size") val size: Float,
    @SerializedName("type") val type: String,
)
{
    val  movieUrl: String
        get() =
            if(site == "YouTube") "https://www.youtube.com/watch?v=$keyPath"
            else "https://vimeo.com/$keyPath"

}

/*
data class TrailerVideoResponse(
    val  id: String,
    val  results: List<Trailer> = emptyList()
)*/
