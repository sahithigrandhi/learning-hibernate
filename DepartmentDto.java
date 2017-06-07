package edu.learningHibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DepartmentDto {
	@Id
	private int did;
	private String dname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
	

}
