package com.woniuxy.movie.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.movie.pojo.Order;
import com.woniuxy.movie.service.OrderService;

@RestController
public class OrderController {
	@Resource
	private OrderService orderService;
	@PostMapping("order")
	public String addOrder(@RequestBody Order order) throws ParseException{
		int uid =1;
		Date currentTime = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		String ordernumber = "movie"+sdf.format(currentTime);
		order.setOrdernum(ordernumber);
		order.setUid(uid);
		System.out.println(order);
		orderService.addOrder(order);
		return "成功";
		
	}
}
