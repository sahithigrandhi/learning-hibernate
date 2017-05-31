package edu.learningHibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name="UserDetails")
public class UserDetails {
	@Id
	private int userId;
	private String userName;
	
	

	public UserDetails() {
		super();
	}
	public UserDetails(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


}
