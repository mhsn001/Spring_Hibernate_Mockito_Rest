package com.khmo.test.wrapper;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import com.khmo.test.domain.Department;
import com.khmo.test.domain.Employee;

public class EmployeeWrapper {

	
	
	private int id;
	private String name;
	private int salary;
	private int age;
	private DepartmentWrapper department;
	long dob;
	
	public EmployeeWrapper() {}
	public EmployeeWrapper(int id, String name, int salary, int age, DepartmentWrapper department, long dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.department = department;
		this.dob = dob;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public DepartmentWrapper getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentWrapper department) {
		this.department = department;
	}
	public long getDob() {
		return dob;
	}
	public void setDob(long dob) {
		this.dob = dob;
	}
	
	
	public static Employee toEntity(EmployeeWrapper wrapper){
		
		if(wrapper instanceof EmployeeWrapper && wrapper != null) {
			return new  Employee(wrapper.getId(), wrapper.getName(), wrapper.getSalary(), wrapper.getAge(), DepartmentWrapper.toEntity(wrapper.getDepartment()), new DateTime(wrapper.getDob()));
		}
		
		return null;
		
	}
	
	
	public static EmployeeWrapper toWrapper(Employee entity){
		
		if(entity instanceof Employee && entity != null) {
			return new  EmployeeWrapper(entity.getId(), entity.getName(), entity.getSalary(), entity.getAge(), DepartmentWrapper.toWrapper(entity.getDepartment()), entity.getDob().getMillis());
		}
		
		return null;
		
	}
	
	
	
	public static List<Employee> toEntityList(List<EmployeeWrapper> wrappers){
		
		
		List<Employee> entities = new ArrayList<Employee>();
		for(EmployeeWrapper w : wrappers) {
			entities.add(toEntity(w));
		}
		
		return entities;
		
	}
	
	
	public static List<EmployeeWrapper> toWrapperList(List<Employee> entities){
		
		List<EmployeeWrapper> wrappers = new ArrayList<EmployeeWrapper>();
		System.out.println(entities);
		for(Employee e: entities) {
			wrappers.add(toWrapper(e));
		}
		
		return wrappers;
		
		
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + (int) (dob ^ (dob >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeWrapper other = (EmployeeWrapper) obj;
		if (age != other.age)
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (dob != other.dob)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	
	
}
