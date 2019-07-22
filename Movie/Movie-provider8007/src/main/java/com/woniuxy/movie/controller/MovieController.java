package com.woniuxy.movie.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.movie.pojo.Movie;
import com.woniuxy.movie.service.MovieService;

@RestController
public class MovieController {
	@Resource
	private MovieService movieService;
	@GetMapping("show/{mid}")
	public Movie showMovieMesByMid(@PathVariable("mid")int mid){
		return movieService.showMovieMesByMid(mid);
		
	}
	@GetMapping("showall")
	public List<Movie> showAllmovies(){
		return movieService.showAllmovies();
		
	}
}
