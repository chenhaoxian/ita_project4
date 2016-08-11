package ita.project4.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ita.project4.main.service.FoodService;

@Controller
@RequestMapping("/food")
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	@RequestMapping("get/passFId")
	@ResponseBody
	public String getPassFId(){
		List<Integer> fIdList = foodService.getPassfId();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<fIdList.size(); i++){
			sb.append(fIdList.get(0)).append(",");
		}
		return sb.toString();
	}
	
	
	

}
