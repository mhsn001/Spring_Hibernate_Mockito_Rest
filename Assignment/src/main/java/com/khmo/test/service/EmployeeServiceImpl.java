package com.khmo.test.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khmo.test.dao.IEmployeeDao;
import com.khmo.test.domain.Employee;
import com.khmo.test.wrapper.EmployeeWrapper;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDao employeeDao;
	
	@Override
	@Transactional
	public List<EmployeeWrapper> save(List<EmployeeWrapper> employees) {
		// TODO Auto-generated method stub
		for(EmployeeWrapper e : employees) {
			
			Employee emp =employeeDao.saveOrUpdate(EmployeeWrapper.toEntity(e));
			e.setId(emp.getId());
		}
		
		return employees;
	}
	
	
	@Override
	@Transactional
	public EmployeeWrapper getById(int id) {
		// TODO Auto-generated method stub
		
		
		return EmployeeWrapper.toWrapper(employeeDao.getById(id));
	}


	@Override
	@Transactional
	public List<EmployeeWrapper> getEmployeeByDepId(int id) {
		// TODO Auto-generated method stub
		
		List<Employee> emps = employeeDao.getEmployeeByDepId(id);
		List<EmployeeWrapper> wrapeers = EmployeeWrapper.toWrapperList(emps);
		
		
		return wrapeers;
	}

}
