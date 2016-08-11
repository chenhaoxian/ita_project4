package ita.project4.main.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ita.project4.main.po.Merchant;
import ita.project4.main.service.MerchantService;


public class MerchantServiceImplTest {
	private static ApplicationContext context;
	private static MerchantService ms;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");	
		ms=(MerchantService)context.getBean("ms");
	}

	@Test
	public void testUpdateMerchantStatus() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindMerchantByMBrand() {
		Merchant md=ms.findMerchantByMBrand("ttt");
		System.out.println("md");
	}

	@Test
	public void testFindAllMBrand() {
		//List<Merchant> mList = ms.findMerchantByPage(p);
		
	}
	

}
