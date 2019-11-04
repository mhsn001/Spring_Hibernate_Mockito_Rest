package com.khmo.test.wrapper;

import org.joda.time.DateTime;

import com.khmo.test.domain.Department;


public class DepartmentWrapper {

	public DepartmentWrapper() {}
	public DepartmentWrapper(int id, String deptName) {
		super();
		this.id = id;
		this.deptName = deptName;
	}

	int id;
	String deptName;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	
	public static Department toEntity(DepartmentWrapper wrapper){
		
		if(wrapper instanceof DepartmentWrapper && wrapper != null) {
			return new Department(wrapper.getId(), wrapper.getDeptName());
		}
		
		return null;
	}
	
	public static DepartmentWrapper toWrapper(Department entity){
		
		if(entity instanceof Department && entity != null) {
			return new DepartmentWrapper(entity.getId(), entity.getDeptName());
		}
		
		return null;
	}
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptName == null) ? 0 : deptName.hashCode());
		result = prime * result + id;
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
		DepartmentWrapper other = (DepartmentWrapper) obj;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.equals(other.deptName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}



	
	
	
	
	
	
}
