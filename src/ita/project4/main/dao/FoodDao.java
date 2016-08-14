package ita.project4.main.dao;

import java.util.List;

import ita.project4.main.po.Food;
import ita.project4.main.pojo.Pager;

public interface FoodDao {
	int saveFood(Food food);

	List<Food> findFoodAll();

	List<Food> findFoodBypage(Pager p);

	int updateFoodStatus(int fId, int status);

	List<Integer> getPassfId();
	
	int deleteFoodBymId(int mId);
}
