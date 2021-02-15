package com.eiver.movie.model.Movie

import com.eiver.movie.model.Movie.Movie

/*
* Create by Randa {DATE}
*/interface OnGetMoviesCallback {

    fun onSuccess(movies: List<Movie?>?)

    fun onError()
}