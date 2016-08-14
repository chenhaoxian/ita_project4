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
		String jpql="select m from Order m where m.oStatus=1";
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
	
	@Override
	public int getOStatusByOId(int oId) {
		// TODO Auto-generated method stub
		String jqpl = "select o from Order o where o.oId=:oId";// :后面是占位符，前面指的是数据库中的字段
		@SuppressWarnings("unchecked")
		List<Order> lo = em.createQuery(jqpl).setParameter("oId", oId).getResultList();
		return lo.get(0).getoStatus();
	
	}
	
}
