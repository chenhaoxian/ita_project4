package ita.project4.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ita.project4.main.po.Order;
import ita.project4.main.pojo.Pager;
import ita.project4.main.service.OrderService;
import ita.project4.main.util.JsonUtils;
import ita.project4.main.vo.VoFood;
import ita.project4.main.vo.VoOrder;
import ita.project4.main.webService.OrderWebSevice;

@Controller
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired 
	private OrderWebSevice orderWebService;
	
	@RequestMapping("get/allOrder/{page}")
	@ResponseBody
	public List<Order> findAllOrder(@PathVariable int page){
		if(page == 0){
			return null;
		}else{
			Pager p = new Pager();
			p.setPage(page);
			p.setRows(4);
			List<Order> oList = orderService.findOrderByPage(p);
			return oList;
		}
	}
	
	@RequestMapping("get/orderPage")
	public String orderPage(Model model){
		Pager p = new Pager();
		p.setPage(1);
		p.setRows(4);
		List<Order> oList = orderService.findOrderByPage(p);
		model.addAttribute("oList", oList);
		return "orderManage";
	}
	
	@RequestMapping("get/orderDetailByOid/{oId}")
	@ResponseBody
	public VoOrder getOrderVo(@PathVariable int oId){
		VoOrder vOrder = orderWebService.getOrderDetailByOid(oId);
		try {
			vOrder.setFoodList(JsonUtils.json2list(vOrder.getFoodInfo(), VoFood.class));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(vOrder.toString());
		return vOrder;
	}
	
	@RequestMapping("get/status/{oId}")
	@ResponseBody
	public int getStatus(@PathVariable int oId){
		return orderService.getOStatusByOId(oId);
	}
	
	@RequestMapping("put/rejectOrder/{oId}")
	@ResponseBody
	public String rejectOrder(@PathVariable int oId){
		int count = orderService.updateOrderStatus(oId, 2);
		if(count >= 1){
			return "success";
		}else{
			return "fail";
		}
	}
	
	@RequestMapping("put/deductOrder/{oId}")
	@ResponseBody
	public String deductOrder(@PathVariable int oId){
		int count = orderService.updateOrderStatus(oId, 3);
		if(count >= 1){
			return "success";
		}else{
			return "fail";
		}
	}
	
	@RequestMapping("put/blackOrder/{oId}/{mId}")
	@ResponseBody
	public String blackOrder(@PathVariable int oId,@PathVariable int mId){
		int count = orderService.blackOrder(oId, 4, mId);
		if(count >= 1){
			return "success";
		}else{
			return "fail";
		}
	}
}
