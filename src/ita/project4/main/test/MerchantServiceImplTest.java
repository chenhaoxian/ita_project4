package ita.project4.main.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ita.project4.main.po.Merchant;
import ita.project4.main.pojo.Pager;
import ita.project4.main.service.MerchantService;

public class MerchantServiceImplTest {
	private static ApplicationContext context;
	private static MerchantService ms;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");	
		ms=(MerchantService)context.getBean("merchantService");
	}

	@Test
	public void testFindMerchantByPage() {
		
	}

	@Test
	public void testUpdateMerchantStatus() {
		Assert.assertTrue(ms.updateMerchantStatus(35,3)==1);
	}

	@Test
	public void testFindMerchantByMBrand() {
		Merchant md=ms.findMerchantByMBrand("小天使");
		System.out.println(md);
	}

	@Test
	public void testFindAllBrand() {
		Pager p = new Pager();
		p.setPage(1);
		List<Merchant> st = ms.findMerchantByPage(p);
		List<String> list = new ArrayList<>();
		for (Merchant m : st) {
			list.add(m.getmBrand());
		}
		System.out.println(list);
	}

	@Test
	public void testSaveMerchant() {
		Merchant merchant=new Merchant();
		merchant.setmId(6);
		merchant.setmPersonName("dfff");
		merchant.setmLocation("好好");
		merchant.setmBrand("小天使");
		merchant.setmCardPath("www.baidu.com");
		merchant.setmIdCard("145456486748455");
		merchant.setmStatus(1);
		merchant.setmTel("64554564545");
		merchant.setmStatus(2);
		int rs=ms.saveMerchant(merchant);
		Assert.assertTrue(rs>=1);
	}

	@Test
	public void testFindMerchantStatus() {
		int mstatus=ms.findMerchantStatus(1);
		System.out.println(mstatus);
		
	}
	
	@Test
	public void testgetAllMerchantStatus(){
		Pager p = new Pager();
		p.setPage(1);
		List<Merchant> st = ms.findMerchantByPage(p);
		List<Integer> list = new ArrayList<>();
		for (Merchant m : st) {
			list.add(m.getmStatus());
		}
		System.out.println(list);
	}
	
	@Test
	public void getPassMId() {
		List<Integer> list = ms.getPassMId();
		System.out.println(list);
		
	}
	

}
