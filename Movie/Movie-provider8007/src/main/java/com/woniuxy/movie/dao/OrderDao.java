package com.woniuxy.movie.dao;

import org.apache.ibatis.annotations.Insert;

import com.woniuxy.movie.pojo.Order;

public interface OrderDao {
@Insert("insert into `order` (ordernum,price,rid,uid,status)values(#{ordernum},#{price},#{rid},#{uid},#{status})")
public boolean addOrder(Order order);
}
