package edu.learningHibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity //(name="User_Details")
public class UserDetails {
	//@Id
	private int user_Id;
	private String userName;
	

	/*public UserDetails(int user_Id, String userName) {
		super();
		this.user_Id = user_Id;
		this.userName = userName;
	}
	
	public UserDetails() {
		super();
	}*/

	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


}
