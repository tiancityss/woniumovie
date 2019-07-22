package com.woniuxy.movie.service;

import java.util.List;

import com.woniuxy.movie.pojo.Movie;

public interface MovieService {
	public Movie showMovieMesByMid (int mid);
	public List<Movie> showAllmovies();
}
