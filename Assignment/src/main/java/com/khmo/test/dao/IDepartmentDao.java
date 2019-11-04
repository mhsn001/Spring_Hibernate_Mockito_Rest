package com.khmo.test.dao;

import org.springframework.stereotype.Repository;

import com.khmo.test.domain.Department;
import com.khmo.test.domain.Employee;


public interface IDepartmentDao extends DaoBase<Department>{

	public Department getById(int id);
	public Department loadById(int id);
	
}
