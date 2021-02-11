package com.eiver.movie.model

/*
* Create by Randa {DATE}
*/interface OnGetMoviesCallback {

    fun onSuccess(movies: List<Movie?>?)

    fun onError()
}