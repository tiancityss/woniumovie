package com.woniuxy.movie.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.movie.dao.OrderDao;
import com.woniuxy.movie.pojo.Order;
import com.woniuxy.movie.service.OrderService;
@Service
public class OrderServiceImp implements OrderService {
	@Resource
	private OrderDao orderDao;

	@Override
	public boolean addOrder(Order order) {
		Boolean re = false;
		re = orderDao.addOrder(order);
		return re;
	}

}
