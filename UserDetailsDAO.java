package edu.learningHibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.learningHibernate.dto.UserDetails;
import edu.learningHibernate.test.HibernateSessionFactory;

public class UserDetailsDAO {

	static SessionFactory sessionfactory = null;
	static Session session = null;
	static Transaction trans = null;

	public static Session getSession() throws Exception{
		if(sessionfactory == null)
		{
			sessionfactory = HibernateSessionFactory.createSessionFactory();
			session = sessionfactory.openSession();
		}
		return session;
	}

	public static void addUser(UserDetails user) throws Exception {

		session=UserDetailsDAO.getSession();

		try {
			trans = session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
			sessionfactory.close();
		}
	}

	public static void deleteUser(int userid) throws Exception {
		session=UserDetailsDAO.getSession();
		try {
			trans = session.beginTransaction();
			UserDetails user = (UserDetails) session.load(UserDetails.class, new Integer(userid));
			session.delete(user);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
			sessionfactory.close();
		}
	}

	public static void updateUser(UserDetails user) throws Exception {
		session=UserDetailsDAO.getSession();

		try {
			trans = session.beginTransaction();
			session.update(user);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
			sessionfactory.close();
		}
	}


}
