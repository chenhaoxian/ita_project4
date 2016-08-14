package ita.project4.main.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ita.project4.main.po.Order;
import ita.project4.main.pojo.Pager;
import ita.project4.main.service.MerchantService;
import ita.project4.main.service.OrderService;

public class OrderServiceImplTest {
	private static ApplicationContext context;
	private static OrderService os;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");	
		os=(OrderService)context.getBean("orderService");
	}

	@Test
	public void testOrderServiceImpl() {
		
	}

	@Test
	public void testSaveOrder() {
		Order order=new Order();
		order.setoId(5);
		order.setuName("sd");
		order.setuTel("343545436");
		order.setmBrand("hdj");
		order.setmTel("8787909");
		order.setFoodInfo("7734");
		int rs=os.saveOrder(order);
		Assert.assertTrue(rs>=1);
	}

	@Test
	public void testFindOrderAll() {
		System.out.println(os.findOrderAll());
	}

	@Test
	public void testFindOrderByPage() {
		Pager p=new Pager();
		p.setPage(1);		
		System.out.println(os.findOrderByPage(p));
	}
	
	@Test
	public void testupdateOrderStatus(){
		os.updateOrderStatus(1, 2);
	}
	
	@Test
	public void testsaveOrder(){
		os.saveOrder(5, 2);
	}
	
	@Test
	public void testgetOStatusByOId(){
		System.out.println(os.getOStatusByOId(1));
	}

}
