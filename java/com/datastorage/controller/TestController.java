package com.datastorage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test1")
@Controller
public class TestController {
	
	@RequestMapping("/ceshi1")
	public @ResponseBody String liucheng(@RequestParam("key") String key){
		System.out.println(key + "");
		return "success";
	}
	
}
