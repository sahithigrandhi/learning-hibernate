package edu.learningHibernate.interfaceModels;

import java.util.List;

import edu.learningHibernate.dto.StudentInfo;

public interface StudentInfoInterface {
	public List<StudentInfo> getAllStudentsInfo() throws Exception;
	public StudentInfo getStudentDetails(int sId) throws Exception;
	public void updateStudent(StudentInfo student) throws Exception;
	public void deleteStudent(int sId) throws Exception;
	public void insertStudent(StudentInfo student) throws Exception;

}
