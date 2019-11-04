package com.khmo.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.khmo.test.domain.Test;
import com.khmo.test.service.ITestService;


@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	ITestService testService;
	
	@RequestMapping(path = "/one", method = RequestMethod.GET)
	public Test testOne(){
		
		/*
		 * System.out.println("************* Inside controller"); Map<String, String>
		 * map = testService.test();
		 */
		
		Test t = new Test();
		t.setId(1);
		t.setTest1("Test1");
		t.setTest2("test2");
		
		return t;
	}
	
	
	
}
