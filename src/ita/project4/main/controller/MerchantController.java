package ita.project4.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ita.project4.main.po.Merchant;
import ita.project4.main.pojo.Pager;
import ita.project4.main.service.MerchantService;

@Controller
@RequestMapping("merchant")
public class MerchantController {
	
	@Autowired
	private MerchantService merchantService;
	
	@RequestMapping("myTest")
	public String test1(){
		Pager p = new Pager();
		p.setPage(2);
		p.setRows(5);
		List<Merchant> mList = merchantService.findMerchantByPage(p);
		System.out.println(mList.size());
		System.out.println(mList.get(0).toString());
		return "tesxt";
		
	}

}
