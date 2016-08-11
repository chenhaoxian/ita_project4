package ita.project4.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ita.project4.main.dao.OrderDao;
import ita.project4.main.po.Order;
import ita.project4.main.pojo.Pager;
import ita.project4.main.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao orderDao;
	
	public OrderServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public int saveOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.saveOrder(order);
	}

	@Override
	public List<Order> findOrderAll() {
		// TODO Auto-generated method stub
		return orderDao.findOrderAll();
	}

	@Override
	public List<Order> findOrderByPage(Pager p) {
		// TODO Auto-generated method stub
		return orderDao.findOrderByPage(p);
	}

}
