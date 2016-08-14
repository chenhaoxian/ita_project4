package ita.project4.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ita.project4.main.dao.FoodDao;
import ita.project4.main.po.Food;
import ita.project4.main.pojo.Pager;
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

	@Override
	public List<Food> findFoodAll() {
		// TODO Auto-generated method stub
		return fooddao.findFoodAll();
	}

	@Override
	public List<Food> findFoodBypage(Pager p) {
		// TODO Auto-generated method stub
		return fooddao.findFoodBypage(p);
	}

	@Override
	@Transactional
	public int updateFoodStatus(int fId, int status) {
		// TODO Auto-generated method stub
		return fooddao.updateFoodStatus(fId, status);
	}

	@Override
	public List<Integer> getPassfId() {
		// TODO Auto-generated method stub
		return fooddao.getPassfId();
	}

	@Override
	@Transactional
	public int deleteFoodBymId(int mId) {
		// TODO Auto-generated method stub
		return fooddao.deleteFoodBymId(mId);
	}

}
