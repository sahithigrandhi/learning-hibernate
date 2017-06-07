package edu.learningHibernate.dto;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.learningHibernate.test.HibernateSessionFactory;

public class One2OneTest {

	public static void main(String[] args) throws HibernateException, Exception {
		Session session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		DepartmentDto d1=new DepartmentDto();
		d1.setDid(1);
		d1.setDname("firstDept");
		
		EmployeeDto e1=new EmployeeDto();
		e1.setEid(1);
		e1.setEname("firstEmp");
		e1.setDepartment(d1);
		
		session.save(e1);
		transaction.commit();
		session.close();

	}

}
