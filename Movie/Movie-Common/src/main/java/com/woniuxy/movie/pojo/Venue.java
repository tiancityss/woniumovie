package com.woniuxy.movie.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Venue implements Serializable{

	private int vid;
	private String name;
	private String type;
	private int flag;
}
