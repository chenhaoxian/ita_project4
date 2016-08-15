package ita.project4.main.webService.Impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import ita.project4.main.util.JsonUtils;
import ita.project4.main.vo.Order;
import ita.project4.main.vo.VoOrder;
import ita.project4.main.webService.OrderWebSevice;

@Component("orderWebService")
public class OrderWebServiceImpl implements OrderWebSevice {

	
	private Properties prop = new Properties();

	@Override
	public VoOrder getOrderDetailByOid(int oId) {
		Client client = Client.create();
		client.setReadTimeout(1000);
//		try {
//			prop.load(new FileInputStream(OrderWebServiceImpl.class.getClassLoader().getResource("properties/webservice.properties").getPath()));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String url = prop.getProperty("urlForOrderMsg")+oId;
		WebResource wr = client.resource("http://10.222.232.152:8082/WeekFourClient/complaintByOId?oId="+oId);
		String orderMsg = wr.accept(MediaType.APPLICATION_JSON_TYPE)// accept请求头
				.get(String.class);
		System.out.println("orderMsg is ..." + orderMsg);
//		Order ovo = JsonUtils.toObject(orderMsg, Order.class);
		VoOrder vOrder = JsonUtils.toObject(orderMsg, VoOrder.class);

		return vOrder;
	}

	

}
