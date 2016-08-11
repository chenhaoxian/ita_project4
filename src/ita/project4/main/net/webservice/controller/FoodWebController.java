package ita.project4.main.net.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ita.project4.main.service.FoodService;

@Controller
@RequestMapping("/foodRest")
public class FoodWebController {
	
	@Autowired
	private FoodService foodService;
	
	
	

}
