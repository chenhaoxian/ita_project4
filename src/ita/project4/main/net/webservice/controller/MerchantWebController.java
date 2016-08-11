package ita.project4.main.net.webservice.controller;

import java.util.List;

import org.eclipse.jdt.internal.compiler.parser.RecoveredMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ita.project4.main.service.MerchantService;

@Controller
@RequestMapping("merchantRest")
public class MerchantWebController {
	
	@Autowired
	private MerchantService merchantService;
	
	@RequestMapping("mytest")
	@ResponseBody
	public String test1(){
		System.out.println("ttt");
		return "tttt";
	} 
	
	
	
	
	
}
