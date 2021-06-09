package com.sehatmd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String Test() throws Exception {
		return "Test 123 ";
	}
	
	@RequestMapping(value = "/test-t", method = RequestMethod.GET)
	public String Testt() throws Exception {
		return "Test 123 4";
	}
}
