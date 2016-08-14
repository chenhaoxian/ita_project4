package ita.project4.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping("get/allMerchant/{page}")
	@ResponseBody
	public List<Merchant> findMerchant(@PathVariable int page){
		Pager p = new Pager();
		p.setPage(page);
		p.setRows(7);
		if(page == 0){
			return null;
		}else{
			List<Merchant> mList = merchantService.findMerchantByPage(p);
			return mList;
		}
	}
	
	@RequestMapping("get/lowMerchant/{page}")
	@ResponseBody
	public List<Merchant> findLowMerchant(@PathVariable int page){
		Pager p = new Pager();
		p.setPage(page);
		p.setRows(7);
		if(page == 0){
			return null;
		}else{
			List<Merchant> mList = merchantService.findLowMerchantByPage(p);
			return mList;
		}
	}
	
	@RequestMapping(value="get/status",method=RequestMethod.GET)
	@ResponseBody
	public String getAllStatus(){
		List<Integer> list = merchantService.getPassMId();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<list.size();i++){
			sb.append(list.get(i)).append(",");
		}
		return sb.toString();
	}

	@RequestMapping(value="/get/status/{mId}",method=RequestMethod.GET)
	@ResponseBody
	public int getMStatus(@PathVariable int mId){
		int status = merchantService.findMerchantStatus(mId);
		return status;
		
	}
	
	@RequestMapping(value="/put/passStatus/{mId}",method=RequestMethod.POST)
	@ResponseBody
	public String passMerchant(@PathVariable int mId){
		int count = merchantService.updateMerchantStatus(mId, 2);
		if(count >=1){
			return "success";
		}else{
			return "fail";
		}
	}
	
	@RequestMapping(value="/put/refuseStatus",method=RequestMethod.POST)
	@ResponseBody
	public String refuseMerchant(int mId){
		int count = merchantService.updateMerchantStatus(mId, 3);
		if(count >=1){
			return "success";
		}else{
			return "fail";
		}
	}
	
	@RequestMapping(value="/put/putBlack/{mId}",method=RequestMethod.POST)
	@ResponseBody
	public String putBlack(@PathVariable int mId){
		System.out.println(mId);
		int count = merchantService.updateMerchantStatus(mId, 4);
		if(count >= 1){
			return "success";
		}else{
			return "fail";
		}
	}

}
