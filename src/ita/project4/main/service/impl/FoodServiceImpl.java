package ita.project4.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ita.project4.main.dao.FoodDao;
import ita.project4.main.po.Food;
import ita.project4.main.service.FoodService;

@Service("foodService")
public class FoodServiceImpl implements FoodService {
	
	@Autowired
	private FoodDao fooddao;

	@Override
	@Transactional
	public int saveFood(Food food) {
		// TODO Auto-generated method stub
		return fooddao.saveFood(food);
	}

}
