package net.crevion.fakhry.popularmovies;

import retrofit.Callback;
import retrofit.http.GET;


/**
 * Created by Fakhry on 23/04/2016.
 */
public interface MoviesApiService {
    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);

    @GET("/movie/top_rated")
    void getTopRatedMovies(Callback<Movie.MovieResult> cb);
}
