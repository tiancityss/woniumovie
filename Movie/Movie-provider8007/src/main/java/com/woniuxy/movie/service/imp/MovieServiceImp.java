package com.woniuxy.movie.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.movie.dao.MovieDao;
import com.woniuxy.movie.pojo.Movie;
import com.woniuxy.movie.service.MovieService;
@Service
public class MovieServiceImp implements MovieService {
	@Resource
	private MovieDao movieDao;

	@Override
	public Movie showMovieMesByMid(int mid) {

		return movieDao.showMovieMesByMid(mid);
	}

	@Override
	public List<Movie> showAllmovies() {
		// TODO Auto-generated method stub
		return movieDao.showAllmovies();
	}

}
