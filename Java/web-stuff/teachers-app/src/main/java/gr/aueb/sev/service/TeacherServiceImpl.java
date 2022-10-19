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
    public void insertTeacher(TeacherDTO teacherDTO) throws SQLException {
        Teacher teacher = extract(teacherDTO);

        try {
            teacherDAO.insert(teacher);
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void deleteTeacher(TeacherDTO teacherDTO) throws SQLException, TeacherNotFoundException {
        Teacher teacher = extract(teacherDTO);

        try {
            if (teacherDAO.delete(teacher) == null) {
                throw new TeacherNotFoundException(teacher);
            }
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void updateTeacher(TeacherDTO oldTeacherDTO, TeacherDTO newTeacherDTO) throws SQLException {
        try {
            Teacher oldTeacher = extract(oldTeacherDTO),
                    newTeacher = extract(newTeacherDTO);

            teacherDAO.update(oldTeacher, newTeacher);
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public Teacher getTeacherId(int id) throws SQLException, TeacherNotFoundException {
        try {
            Teacher result = teacherDAO.getTeacherById(id);
            if (result == null) {
                throw new TeacherNotFoundException(result);
            }

            return result;
        } catch (TeacherNotFoundException e) {
            throw e;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<Teacher> getTeachersByLastName(String lastname) throws SQLException {
        try {
            return teacherDAO.getTeachersByLastname(lastname);
        } catch (SQLException e) {
            throw e;
        }
    }

    // Helper functions
    private Teacher extract(TeacherDTO teacherDTO) {
        return new Teacher(
                teacherDTO.getId(),
                teacherDTO.getFirstname(),
                teacherDTO.getLastname());
    }
}
