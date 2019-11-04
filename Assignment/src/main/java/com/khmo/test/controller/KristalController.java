package com.khmo.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.khmo.test.domain.Employee;
import com.khmo.test.service.IKristalService;

@RestController
@RequestMapping("/home")
public class KristalController{

	/*
	 * @RequestMapping(path ="/numbers", method = RequestMethod.POST) public
	 * List<Employee> saveEmployee(@RequestBody List<Employee> employees){ return
	 * employeeService.save(employees); }
	 * 
	 * @RequestMapping(path = "/employee/{id}", method = RequestMethod.GET) public
	 * Employee getEmployee(@PathVariable int id){ Employee emp =
	 * employeeService.getById(id); return emp; }
	 */
	@Autowired
	IKristalService kristalService;
	
	/*
	 * @RequestMapping(path ="/numbers", method = RequestMethod.GET) public
	 * List<Employee> getNumbers(@RequestBody List<> employees){ return
	 * kristalService.save(employees); }
	 * 
	 * @RequestMapping(path = "/employee/{id}", method = RequestMethod.GET) public
	 * Employee getEmployee(@PathVariable int id){ Employee emp =
	 * employeeService.getById(id); return emp; }
	 */
	
	
}
