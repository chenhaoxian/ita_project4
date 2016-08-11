package ita.project4.main.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ita.project4.main.po.Food;
import ita.project4.main.service.FoodService;
import ita.project4.main.service.MerchantService;

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

}
