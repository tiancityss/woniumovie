package com.woniuxy.movie.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Checked implements Serializable{

	private int cid;
	private int rid;
	private int sid;
	private int flag;
}
