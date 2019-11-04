package com.khmo.testing.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.khmo.test.dao.IEmployeeDao;
import com.khmo.test.domain.Department;
import com.khmo.test.domain.Employee;
import com.khmo.test.service.IDepartmentService;
import com.khmo.test.service.IEmployeeService;
import com.khmo.test.wrapper.EmployeeWrapper;
import com.khmo.testing.util.UnitTestDataObjects;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest{

	@Mock
	IEmployeeDao employeeDao;
	
	@Test
	public void getById(){
		Employee emp = UnitTestDataObjects.getEmployeeEntity(1);
		Mockito.when(employeeDao.getById(emp.getId())).thenReturn(emp);
		Employee emp1 = employeeDao.getById(emp.getId());
		Assert.assertEquals(emp, emp1);		
	}
	
	@Test
	public void getDepartmentsEmployee(){
		List<Employee> employees = UnitTestDataObjects.getEmployeeEntityList();
		Mockito.when(employeeDao.getEmployeeByDepId(Mockito.anyInt())).thenReturn(employees);
		List<Employee> employees1 = employeeDao.getEmployeeByDepId(1);
		Assert.assertEquals(employees, employees1);	
	}
	
	
		
}
