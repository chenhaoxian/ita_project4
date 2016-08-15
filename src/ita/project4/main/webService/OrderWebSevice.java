package ita.project4.main.webService;

import java.util.Properties;

import ita.project4.main.vo.VoOrder;


public interface OrderWebSevice {
	
	VoOrder getOrderDetailByOid(int oId);
	
//	String noticeMerchant();

}
