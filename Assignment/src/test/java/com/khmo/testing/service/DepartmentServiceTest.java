package com.khmo.testing.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.khmo.test.dao.IDepartmentDao;
import com.khmo.test.dao.IEmployeeDao;
import com.khmo.test.domain.Department;
import com.khmo.test.domain.Employee;
import com.khmo.test.wrapper.DepartmentWrapper;
import com.khmo.testing.util.UnitTestDataObjects;

@RunWith(MockitoJUnitRunner.class)
public class DepartmentServiceTest{

	@Mock
	IDepartmentDao departmentDao;
	
	@Test
	public void getById(){
		DepartmentWrapper dep = UnitTestDataObjects.getDepartmentWrapper(1);
		Mockito.when(departmentDao.getById(dep.getId())).thenReturn(DepartmentWrapper.toEntity(dep));
		Department dep1 = departmentDao.getById(dep.getId());
		Assert.assertEquals(dep, dep1);		
	}
	
	
		
}