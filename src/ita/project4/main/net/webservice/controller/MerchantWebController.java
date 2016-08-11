package ita.project4.main.net.webservice.controller;

import org.eclipse.jdt.internal.compiler.parser.RecoveredMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ita.project4.main.service.MerchantService;

@Controller
@RequestMapping("/merchantRest")
public class MerchantWebController {
	
	@Autowired
	private MerchantService merchantService;

//	@RequestMapping(value="/get/status/{mId}",method=RequestMethod.GET)
//	@resp
//	public String getMStatus(@PathVariable int mId){
//		int status = 0;
//		return status;
//	}
	
	
	
}
