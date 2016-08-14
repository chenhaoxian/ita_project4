package ita.project4.main.dao;

import java.util.List;

import ita.project4.main.po.Order;
import ita.project4.main.pojo.Pager;

public interface OrderDao {

	int saveOrder(Order order);

	List<Order> findOrderAll();

	List<Order> findOrderByPage(Pager p);

	int updateOrderStatus(int oId, int oStatus);
	
	int saveOrder(int oId,int oStatus);
	
	int getOStatusByOId(int oId);

}
