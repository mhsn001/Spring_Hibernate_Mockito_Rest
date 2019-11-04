package com.khmo.testing.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.khmo.test.domain.Department;
import com.khmo.test.domain.Employee;
import com.khmo.test.service.IDepartmentService;
import com.khmo.test.service.IEmployeeService;
import com.khmo.test.wrapper.DepartmentWrapper;
import com.khmo.test.wrapper.EmployeeWrapper;
import com.khmo.testing.util.UnitTestDataObjects;


@RunWith(MockitoJUnitRunner.class)
public class HomeControllerTest {

	@Mock
	IEmployeeService employeeService;
	
	
	@Mock
	IDepartmentService departmentService;
	
	
	@Test
	public void getEmployee(){	
		
		EmployeeWrapper emp = UnitTestDataObjects.getEmployeeWrapper(1);
		Mockito.when(employeeService.getById(emp.getId())).thenReturn(emp);
		EmployeeWrapper emp1 = employeeService.getById(1);
		Assert.assertEquals(emp, emp1);
		
	}
	
	@Test
	public void getDepartment(){	
		DepartmentWrapper dep = UnitTestDataObjects.getDepartmentWrapper(1);
		Mockito.when(departmentService.getById(dep.getId())).thenReturn(dep);
		
		DepartmentWrapper dep1 = departmentService.getById(dep.getId());
		Assert.assertEquals(dep, dep1);
	}

	@Test
	public void getDepartmentsEmployee(){	
		/*
		 * Department dep = departmentService.loadById(id); return dep.getEmployees();
		 */
		List<EmployeeWrapper> employees = UnitTestDataObjects.getEmployeeWrapperList();
		Mockito.when(employeeService.getEmployeeByDepId(Mockito.anyInt())).thenReturn(employees);
		List<EmployeeWrapper> employees1 = employeeService.getEmployeeByDepId(1);
		Assert.assertEquals(employees, employees1);
		
	}
	
	
	
	
}
