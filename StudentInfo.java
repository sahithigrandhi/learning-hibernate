package edu.learningHibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name="StudentDetails")
public class StudentInfo {
	@Id 
	private int sId;
	private String sName;
	private double gpa;
	private String department;
	private String emailId;
	public StudentInfo(int sId, String sName, double gpa, String department, String emailId) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.gpa = gpa;
		this.department = department;
		this.emailId = emailId;
	}
	public StudentInfo() {
		super();
	}
	public StudentInfo(int sId, String sName, String department, String emailId) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.department = department;
		this.emailId = emailId;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "StudentInfo [sId=" + sId + ", sName=" + sName + ", gpa=" + gpa + ", department=" + department
				+ ", emailId=" + emailId + "]";
	}
		
}
