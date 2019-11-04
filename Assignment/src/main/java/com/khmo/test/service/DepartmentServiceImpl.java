package com.khmo.test.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.khmo.test.dao.IDepartmentDao;
import com.khmo.test.domain.Department;
import com.khmo.test.wrapper.DepartmentWrapper;

@Service
public class DepartmentServiceImpl implements IDepartmentService{

	
	@Autowired
	IDepartmentDao departmentDao;
	
	@Override
	@Transactional
	public List<DepartmentWrapper> save(List<DepartmentWrapper> departments) {
		
		for(DepartmentWrapper d : departments) {
			departmentDao.save(DepartmentWrapper.toEntity(d));	
		}
		
		return departments;
	}
	
	
	@Override
	@Transactional
	public DepartmentWrapper getById(int id) {
		
		return DepartmentWrapper.toWrapper(departmentDao.getById(id));
	}
	
	@Override
	@Transactional
	public DepartmentWrapper loadById(int id) {
		
		return DepartmentWrapper.toWrapper(departmentDao.loadById(id));
	}
	
}
