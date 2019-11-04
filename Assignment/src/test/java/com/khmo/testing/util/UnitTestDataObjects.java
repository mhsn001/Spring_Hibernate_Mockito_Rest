package com.khmo.testing.util;

import java.util.ArrayList;
import java.util.List;

import com.khmo.test.domain.Department;
import com.khmo.test.domain.Employee;
import com.khmo.test.wrapper.DepartmentWrapper;
import com.khmo.test.wrapper.EmployeeWrapper;

public class UnitTestDataObjects {


	public static DepartmentWrapper getDepartmentWrapper(int id){
		DepartmentWrapper dep = new DepartmentWrapper(id,"dept"+id);
		return dep;
	}
	
	public static EmployeeWrapper getEmployeeWrapper(int id){
		EmployeeWrapper emp = new EmployeeWrapper();
		emp.setId(id);
		emp.setAge(22+id);
		emp.setDepartment(getDepartmentWrapper(id));
		emp.setName("Khan"+id);
		emp.setSalary(5000*id);
		return emp;
	}
	
	public static List<EmployeeWrapper> getEmployeeWrapperList(){
		List<EmployeeWrapper> employees = new ArrayList<EmployeeWrapper>();
		for(int i=0; i<5; i++) {
			EmployeeWrapper emp = getEmployeeWrapper(i);
			employees.add(emp);
			
		}
		
		return employees;
	}
	
	
	public static Department getDepartmentEntity(int id){
		return DepartmentWrapper.toEntity(getDepartmentWrapper(id));
	}
	
	public static Employee getEmployeeEntity(int id){
		return EmployeeWrapper.toEntity(getEmployeeWrapper(id));
	}
	
	public static List<Employee> getEmployeeEntityList(){
		return EmployeeWrapper.toEntityList(getEmployeeWrapperList());
	}
	
	
	
	
	
}
