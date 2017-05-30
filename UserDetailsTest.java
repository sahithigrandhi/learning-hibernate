package edu.learningHibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.learningHibernate.dto.UserDetails;

public class UserDetailsTest {

	public static void main(String[] args) {
		UserDetails user1=new UserDetails();
		user1.setUser_Id(1);
		user1.setUserName("first user");

		//UserDetails user2=new UserDetails(2,"second user");

		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(user1);
		//session.delete(user2);
		//session.save(user2);
		session.getTransaction().commit();
		
	}

}
