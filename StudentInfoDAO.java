package edu.learningHibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.learningHibernate.dto.StudentInfo;
import edu.learningHibernate.dto.UserDetails;
import edu.learningHibernate.interfaceModels.StudentInfoInterface;
import edu.learningHibernate.test.HibernateSessionFactory;

public class StudentInfoDAO implements StudentInfoInterface {

	@Override
	public List<StudentInfo> getAllStudentsInfo() throws Exception {
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from StudentDetails");
		List<StudentInfo> Students = query.list();
		transaction.commit();
		session.close();
		return Students;
	}

	@Override
	public StudentInfo getStudentDetails(int sId) throws Exception {
		Session session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from StudentDetails where");
		StudentInfo student = (StudentInfo) session.load(StudentInfo.class, new Integer(sId));
		transaction.commit();
		session.close();
		return student;
		
	}

	@Override
	public void updateStudent(StudentInfo student) throws Exception {
		Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
		session.update(student);	
		transaction.commit();
		session.close();
		
	}

	@Override
	public void deleteStudent(int sId) throws Exception {
		Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        StudentInfo student = (StudentInfo) session.load(StudentInfo.class, new Integer(sId));
		session.delete(student);
		transaction.commit();
		session.close();
		
	}

	@Override
	public void insertStudent(StudentInfo student) throws Exception {
		Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
		session.save(student);	
		transaction.commit();
		session.close();
		
	}

	
}
