package edu.learningHibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmployeeDto {
	@Id
	private int eid;
	private String ename;
	
	@OneToOne
	private DepartmentDto Department;
	
	public DepartmentDto getDepartment() {
		return Department;
	}
	public void setDepartment(DepartmentDto department) {
		Department = department;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	

}
