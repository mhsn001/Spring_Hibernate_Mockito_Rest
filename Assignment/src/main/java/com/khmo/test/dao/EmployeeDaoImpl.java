package com.khmo.test.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.khmo.test.domain.Department;
import com.khmo.test.domain.Employee;

@Repository
public class EmployeeDaoImpl extends AbstractHibernateDao<Employee> implements IEmployeeDao{

	
	@Override
	public Employee getById(int id) {
		
		return (Employee)getCurrentSession().get(Employee.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployeeByDepId(int id) {
		
		Criteria c = getCurrentSession().createCriteria(Employee.class, "emp");
        c.add(Restrictions.eq("emp.department.id", id));
        return (List<Employee>)c.list();
       
	}

	
	
}
