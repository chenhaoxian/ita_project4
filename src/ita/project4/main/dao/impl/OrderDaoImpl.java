package ita.project4.main.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ita.project4.main.dao.OrderDao;
import ita.project4.main.po.Order;
import ita.project4.main.pojo.Pager;

@Repository("orderDao")
public class OrderDaoImpl implements OrderDao{
	
	@PersistenceContext(name = "un")
	private EntityManager em;

	public OrderDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int saveOrder(Order order) {
		// TODO Auto-generated method stub
		em.persist(order);
		return order.getoId();
	}

	@Override
	public List<Order> findOrderAll() {
		// TODO Auto-generated method stub
		String jpql="from Order";
		List<Order> lo=em.createQuery(jpql).getResultList();
		return lo;
		
	}

	@Override
	public List<Order> findOrderByPage(Pager p) {
		// TODO Auto-generated method stub
		String jpql="from Order";
		Query query = em.createQuery(jpql);
		query.setFirstResult((p.getPage() - 1) * p.getRows());
		query.setMaxResults(p.getRows());
		return query.getResultList();
	}

	@Override
	public int updateOrderStatus(int oId, int oStatus) {
		// TODO Auto-generated method stub
		Order order=em.find(Order.class, oId);
		order.setoStatus(oStatus);
		em.merge(order);
		return 1;
	}

	public int saveOrder(int oId, int oStatus) {
		// TODO Auto-generated method stub
		Order order=new Order();
		order.setoId(oId);
		order.setoStatus(oStatus);
		em.persist(order);
		return order.getoId();
		}

}
