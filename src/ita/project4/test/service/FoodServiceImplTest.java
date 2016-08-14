package ita.project4.test.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ita.project4.main.po.Food;
import ita.project4.main.pojo.Pager;
import ita.project4.main.service.FoodService;

public class FoodServiceImplTest {
	private static ApplicationContext context;
	private static FoodService fs;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");	
		fs=(FoodService)context.getBean("foodService");
	}

	@Test
	public void testSaveFood() {
		Food food=new Food();
		food.setfName("ddd");
		food.setfStatus(2);
		food.setfViewPath("hbsdhh");
		food.setmId(1);
		int rs=fs.saveFood(food);
		Assert.assertTrue(rs>=1);
	}
	
	@Test
	public void testfindFoodAll(){
		List<Food> lf=fs.findFoodAll();
		System.out.println(lf);
	}
	
	@Test
	public void testfindFoodBypage(){
		Pager p = new Pager();
		p.setPage(1);
		List<Food> st = fs.findFoodBypage(p);
		System.out.println(st);

}
	@Test
	public void updateFoodStatus(){
		fs.updateFoodStatus(2, 3);
		
	}
	
	@Test
	public void testgetPassfId(){
		List<Integer> list=fs.getPassfId();
		System.out.println(list);
	}
}
