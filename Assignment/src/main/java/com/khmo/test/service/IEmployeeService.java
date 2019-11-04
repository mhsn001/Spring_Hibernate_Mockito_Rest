package com.khmo.test.service;

import java.util.List;

import com.khmo.test.domain.Employee;
import com.khmo.test.wrapper.EmployeeWrapper;

public interface IEmployeeService {

	public List<EmployeeWrapper> save(List<EmployeeWrapper> employees);
	
	public EmployeeWrapper getById(int id);
	
	public List<EmployeeWrapper> getEmployeeByDepId(int id);
	
	
}
