package gr.aueb.sev.dao;

import java.sql.SQLException;
import java.util.List;

import gr.aueb.sev.model.Student;

public interface IStudentDAO {
	void insert(Student teacher) throws SQLException;
	
	void delete(Student teacher) throws SQLException;
	
	void update(Student oldTeacher, Student newTeacher) throws SQLException;
	
	List<Student> getStudentsByLastname(String lastname) throws SQLException;
	
	Student getStudentById(int id) throws SQLException;
}
