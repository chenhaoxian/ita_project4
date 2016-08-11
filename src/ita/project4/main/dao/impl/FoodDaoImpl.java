package ita.project4.main.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ita.project4.main.dao.FoodDao;
import ita.project4.main.po.Food;
import ita.project4.main.pojo.Pager;

@Repository("foodDao")
public class FoodDaoImpl implements FoodDao {

	@PersistenceContext(name = "un")
	private EntityManager em;

	@Override
	public int saveFood(Food food) {
		// TODO Auto-generated method stub
		em.persist(food);
		return food.getfId();
	}

	@Override
	public List<Food> findFoodAll() {
		// TODO Auto-generated method stub
		String jqpl="from Food";
		List<Food> lf=em.createQuery(jqpl).getResultList();
		return lf;
	}

	@Override
	public List<Food> findFoodBypage(Pager p) {
		String jpql = "from Food";
		// em.createQuery(jpql).setFirstResult((p.getPage()-1)*p.getRows()).getResultList()
		Query query = em.createQuery(jpql);
		query.setFirstResult((p.getPage() - 1) * p.getRows());
		query.setMaxResults(p.getRows());
		return query.getResultList();
	}

	@Override
	public int updateFoodStatus(int fId, int status) {
		Food food=em.find(Food.class, fId);
		food.setfStatus(status);
		em.merge(food);
		return 1;
	}

	@Override
	public List<Integer> getPassfId() {
		String jqpl = "select f from Food f where f.fStatus=3";
		List<Food> st = em.createQuery(jqpl).getResultList();
		List<Integer> list = new ArrayList<>();
		for (Food f : st) {
			list.add(f.getfId());
		}
		return list;
	}
}
