package ita.project4.main.service;

import java.util.List;

import ita.project4.main.po.Order;
import ita.project4.main.pojo.Pager;

public interface OrderService {
	
	int saveOrder(Order order);
	
	List<Order> findOrderAll();
	
	List<Order> findOrderByPage(Pager p);
	
	int saveOrder(int oId,int oStatus);
	
	int updateOrderStatus(int oId);
	
	
	
	
	

}
