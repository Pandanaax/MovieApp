package com.eiver.movie.model.Trailer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.eiver.movie.MOVIE_ID
import com.eiver.movie.R

/*
* Create by Randa {DATE}
*/
class TrailerAdapter(
    private var trailer: MutableList<Trailer>,
    private val onTrailerClick: (trailer: Trailer) -> Unit
) : RecyclerView.Adapter<TrailerAdapter.TrailerViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrailerViewHolder {
            val view = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.activity_movie_details, parent, false)
            return TrailerViewHolder(view)

        }

        override fun getItemCount(): Int = trailer.size

        override fun onBindViewHolder(holder: TrailerViewHolder, position: Int) {
            holder.bind(trailer[position])
        }

        fun appendTrailer(trailer: List<Trailer>) {
            this.trailer.addAll(trailer)
            notifyItemRangeInserted(
                this.trailer.size,
                trailer.size - 1
            )
        }

        inner class TrailerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            val trailerResult: VideoView = itemView.findViewById(R.id.movie_trailer)

            fun bind(trailer: Trailer) {


                trailerResult.setVideoPath("https://api.themoviedb.org/3/movie/${MOVIE_ID}/videos")
                //trailerResult.setVideoPath("https://api.themoviedb.org/3/movie/464052/videos?api_key=05c8d1167eb969eb35bfb3bf9bc86315")
            }

        }


}