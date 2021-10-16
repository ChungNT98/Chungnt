package com.chungnt.moviemvvm.data.api

import com.chungnt.moviemvvm.data.vo.MovieDetail
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface TheMovieDBInterface  {

    // https://api.themoviedb.org/3/movie/popular?api_key=2f639a95a640b40d7f2f5eb079cd9d94
    // https://api.themoviedb.org/3/movie/580489?api_key=2f639a95a640b40d7f2f5eb079cd9d94
    // https://api.themoviedb.org/3/movie/popular?api_key=2f639a95a640b40d7f2f5eb079cd9d94

    @GET("movie/{movie_id}")
    fun getMovieDetail(@Path("movie_id") id: Int): Single<MovieDetail> 
}