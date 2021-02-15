package com.eiver.movie.model.Trailer

/*
* Create by Randa {DATE}
*/interface OnGetTrailerCallback {
    fun onSuccess(trailer: List<Trailer?>?)

    fun onError()
}