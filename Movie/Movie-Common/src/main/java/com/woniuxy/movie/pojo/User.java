package com.woniuxy.movie.pojo;

import java.io.Serializable;

import lombok.Data;
/**
 * 用户表
 * @author Administrator
 *
 */
@Data
public class User implements Serializable{
	
	private int uid;
	private String account;
	private String pass;
	private int role;
	private int flag;
	
}
