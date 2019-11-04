package com.khmo.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.khmo.test.domain.Department;
import com.khmo.test.domain.Employee;
import com.khmo.test.service.DepartmentServiceImpl;
import com.khmo.test.service.IDepartmentService;
import com.khmo.test.service.IEmployeeService;
import com.khmo.test.wrapper.DepartmentWrapper;
import com.khmo.test.wrapper.EmployeeWrapper;



@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	IEmployeeService employeeService;
	
	@Autowired
	IDepartmentService departmentService;
	
	@RequestMapping(path ="/employee", method = RequestMethod.POST)
	public List<EmployeeWrapper> saveEmployee(@RequestBody List<EmployeeWrapper> employees){
		return employeeService.save(employees);
	}
	
	@RequestMapping(path = "/employee/{id}", method = RequestMethod.GET)
	public EmployeeWrapper getEmployee(@PathVariable int id){	
		EmployeeWrapper emp = employeeService.getById(id);
		return emp;
	}

	@RequestMapping(path ="/department", method = RequestMethod.POST)
	public List<DepartmentWrapper> saveDepartments(@RequestBody List<DepartmentWrapper> departments){
		return departmentService.save(departments);
	}
	
	@RequestMapping(path = "/department/{id}", method = RequestMethod.GET)
	public DepartmentWrapper getDepartment(@PathVariable int id){	
		DepartmentWrapper dep = departmentService.getById(id);
		return dep;
	}

	@RequestMapping(path = "/department/{id}/employee", method = RequestMethod.GET)
	public List<EmployeeWrapper> getDepartmentsEmployee(@PathVariable int id){	

		return employeeService.getEmployeeByDepId(id);
	}
	
	
	
	@RequestMapping(path = "/getDummies", method = RequestMethod.GET)
	public List<EmployeeWrapper> getDummies(){
		
		List<EmployeeWrapper> list = new ArrayList<EmployeeWrapper>();
		for(int i=0; i<2; i++) {
			
			DepartmentWrapper d = new DepartmentWrapper(i,"Department-"+i);
						
			EmployeeWrapper e = new EmployeeWrapper();
			e.setName("emp"+i);
			e.setDepartment(d);
			e.setSalary(10000+i);
			e.setDob(DateTime.now().getMillis());
			list.add(e);
			}
		
		return list;
	}
	
	
	
}