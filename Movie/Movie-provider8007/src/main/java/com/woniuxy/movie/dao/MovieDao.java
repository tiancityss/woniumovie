package com.woniuxy.movie.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.woniuxy.movie.pojo.Movie;

public interface MovieDao {
@Select("select * from movie where mid = #{mid}")
public Movie showMovieMesByMid (int mid);
@Select("select * from movie")
public List<Movie> showAllmovies();
}
