package gr.aueb.sev.dao;

import java.sql.SQLException;
import java.util.List;

import gr.aueb.sev.model.Teacher;

public interface ITeacherDAO {
	void insert(Teacher teacher) throws SQLException;
	
	Teacher delete(Teacher teacher) throws SQLException;
	
	void update(Teacher oldTeacher, Teacher newTeacher) throws SQLException;
	
	List<Teacher> getTeachersByLastname(String lastname) throws SQLException;
	
	Teacher getTeacherById(int id) throws SQLException;
}
