package ita.project4.main.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ita.project4.main.dao.FoodDao;
import ita.project4.main.po.Food;

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

}
