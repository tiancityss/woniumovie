package com.woniuxy.movie.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Order implements Serializable{
	
	private int oid;
	private Date starttime;
	private String ordernum;
	private int price;
	private int rid;
	private int uid;
	private int flag;
	private int status;
	
}
