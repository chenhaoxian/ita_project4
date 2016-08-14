package ita.project4.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ita.project4.main.common.BaseController;
import ita.project4.main.po.Food;
import ita.project4.main.po.Merchant;
import ita.project4.main.pojo.Pager;
import ita.project4.main.service.FoodService;

@Controller
@RequestMapping("/food")
public class FoodController extends BaseController{
	
	@Autowired
	private FoodService foodService;
	
	@RequestMapping("get/passFId")
	@ResponseBody
	public String getPassFId(){
		List<Integer> fIdList = foodService.getPassfId();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<fIdList.size(); i++){
			sb.append(fIdList.get(i)).append(",");
		}
		return sb.toString();
	}
	
	@RequestMapping("get/allFood/{page}")
	@ResponseBody
	public List<Food> getAllFood(@PathVariable int page){
		Pager p = new Pager();
		p.setPage(page);
		p.setRows(4);
		if(page == 0){
			return null;
		}else{
			List<Food> fList = foodService.findFoodBypage(p);
			System.out.println(fList);
			return fList;
		}
	}
	 
	@RequestMapping("put/pushFood/{fId}")
	@ResponseBody
	public String pushFood(@PathVariable int fId){
		int count = foodService.updateFoodStatus(fId, 3);
		if(count >= 1){
			return "success";
		}else{
			return "fail";
		}
	}
	
	@RequestMapping("put/cancelFood/{fId}")
	@ResponseBody
	public String cancelFood(@PathVariable int fId){
		int count = foodService.updateFoodStatus(fId, 2);
		if(count >= 1){
			return "success";
		}else{
			return "fail";
		}
	}
	

}
