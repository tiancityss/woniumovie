package com.woniuxy.movie.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Movie implements Serializable{

	private int mid;
	private String name;
	private String type;
	private String zone;
	private Date showTime;
	private int attention;
	private String introduce;
	private String prevue;
	private double price;
	private double cutprice;
	private int show;
	private int num;
	private int flag;
}
