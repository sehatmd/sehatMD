package com.sehatmd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/testPP", method = RequestMethod.GET)
	public String Test() throws Exception {
		return "Test PP";
	}
	
}
