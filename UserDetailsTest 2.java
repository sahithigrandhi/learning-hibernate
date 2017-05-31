package edu.learningHibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.learningHibernate.dto.UserDetails;
import edu.learningHibernate.dao.UserDetailsDAO;

public class UserDetailsTest {

	public static void main(String[] args) throws Exception {
		UserDetails user1=new UserDetails();
		user1.setUserId(1);
		user1.setUserName("firstrevised user");

		UserDetails user2=new UserDetails(2," 2nd user");
		UserDetails user3=new UserDetails(3," 3rd user");
		UserDetails user4=new UserDetails(4," 4th user");

		//UserDetailsDAO.saveUser(2);
		//UserDetailsDAO.deleteUser(2);
		//UserDetailsDAO.updateUser(user3);
		UserDetailsDAO.updateUser(user1);
	}

}
