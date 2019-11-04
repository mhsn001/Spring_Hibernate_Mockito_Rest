package com.khmo.test.service;

import java.util.List;
import com.khmo.test.domain.Department;
import com.khmo.test.wrapper.DepartmentWrapper;


public interface IDepartmentService {
	
	public List<DepartmentWrapper> save(List<DepartmentWrapper> departments);
	public DepartmentWrapper getById(int id);
	public DepartmentWrapper loadById(int id);

}
