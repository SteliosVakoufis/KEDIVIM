package gr.aueb.sev.service;

import java.sql.SQLException;
import java.util.List;

import gr.aueb.sev.dao.ITeacherDAO;
import gr.aueb.sev.dto.TeacherDTO;
import gr.aueb.sev.model.Teacher;
import gr.aueb.sev.service.exceptions.TeacherNotFoundException;

public class TeacherServiceImpl implements ITeacherService {
    private final ITeacherDAO teacherDAO;

    public TeacherServiceImpl(ITeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    @Override
    public void deleteTeacher(TeacherDTO teacherDTO) throws SQLException, TeacherNotFoundException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Teacher getTeacherId(long id) throws SQLException, TeacherNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Teacher> getTeachersByLastName(String lastname) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insertTeacher(TeacherDTO TeacherDTO) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateTeacher(TeacherDTO oldTeacherDTO, TeacherDTO newTeacherDTO) throws SQLException {
        // TODO Auto-generated method stub
        
    }
    
}
