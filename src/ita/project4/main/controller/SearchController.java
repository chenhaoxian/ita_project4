package ita.project4.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ita.project4.main.po.Merchant;
import ita.project4.main.service.MerchantService;

@Controller
@RequestMapping("search")
public class SearchController {

	@Autowired
	private MerchantService merchantService;
	
	@RequestMapping("get/telList")
	@ResponseBody
	public List<String> getTelList(){
		return merchantService.findAllmTel();
	}
	
	@RequestMapping("merchant/{mTel}")
	@ResponseBody
	public Merchant getMerchant(@PathVariable String mTel){
		Merchant m = merchantService.findMerchantBymTel(mTel, 0);
		System.out.println(m.toString());
		return m;
	}
	
	@RequestMapping("merchant/update/{mId}/{status}")
	@ResponseBody
	public String updateMerchant(@PathVariable int mId,@PathVariable int status){
		int count = merchantService.updateMerchantStatus(mId, status);
		if(count == 1){
			return "success";
		}else{
			return "fail";
		}
	}
	
}
