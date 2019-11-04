package com.khmo.test.dao;

import java.util.List;

import com.khmo.test.domain.Employee;

public interface IEmployeeDao extends DaoBase<Employee>{

	public Employee getById(int id);
	public List<Employee> getEmployeeByDepId(int id);
	
}
