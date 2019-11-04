package com.khmo.test.dao;

import org.springframework.stereotype.Repository;

import com.khmo.test.domain.Department;
import com.khmo.test.domain.Employee;

@Repository
public class DepartmentDaoImpl extends AbstractHibernateDao<Department> implements IDepartmentDao {

	@Override
	public Department getById(int id) {
		
		return (Department)getCurrentSession().get(Department.class, id);
	}

	@Override
	public Department loadById(int id) {
		// TODO Auto-generated method stub
		return (Department)getCurrentSession().load(Department.class, id);
	}
	

}
