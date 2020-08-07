package com.koreait.apart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private HomeService service;

	@RequestMapping
	public String home(Model model) {
		model.addAttribute("locationList", service.selLocalCdList());
		return "index";
	}

	@RequestMapping(value = "/result", method =RequestMethod.POST)
	public String result(Model model ,SearchVO param) {
		
		System.out.println("year: " + param.getYear());
		System.out.println("mon: " + param.getMon());
		System.out.println("locationCd: " + param.getLocationCd());
		
		model.addAttribute("data",service.getData(param));
		
		return "result";
	}

}
