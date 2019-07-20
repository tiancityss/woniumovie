package com.woniuxy.movie.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Seat implements Serializable{
	private int sid;
	private int vid;
	private int addr_x;
	private int addr_y;
	private int flag;
}
