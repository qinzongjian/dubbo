package com.qinzj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qinzj.service.ProviderService;

@RestController
@RequestMapping(value = "/")
public class TestController {
	
	@Autowired
	private ProviderService ps;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		
		String rs = ps.sayHello();
		
		return rs;
	}
	
}
