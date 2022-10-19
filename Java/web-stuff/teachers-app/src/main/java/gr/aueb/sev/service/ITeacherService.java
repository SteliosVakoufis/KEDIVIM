package gr.aueb.sev.service;

import java.sql.SQLException;
import java.util.List;

import gr.aueb.sev.dto.TeacherDTO;
import gr.aueb.sev.model.Teacher;
import gr.aueb.sev.service.exceptions.TeacherNotFoundException;

public interface ITeacherService {

    /**
     * Inserts a {@link Teacher} based on the data carried by {@link TeacherDTO}.
     * 
     * @param TeacherDTO
     *                   DTO object that contains the data.
     * @throws SQLException
     *                      If any error occurs during SQL insert we get an
     *                      exception.
     */
    void insertTeacher(TeacherDTO TeacherDTO)
            throws SQLException;

    /**
     * Deletes a {@link Teacher} based on the data carried by {@link TeacherDTO}
     * 
     * @param teacherDTO
     *                   DTO object that contains the data (ID).
     * @throws SQLException
     *                                  If any error occurs during SQL delete we get
     *                                  an
     *                                  exception.
     * @throws TeacherNotFoundException
     *                                  if any teacher, identified by their id is
     *                                  not found.
     */
    void deleteTeacher(TeacherDTO teacherDTO)
            throws SQLException, TeacherNotFoundException;

    /**
     * Updates a {@link Teacher} based on the data carried by new and old TeacherDTO
     * {@link TeacherDTO}
     * 
     * @param oldTeacherDTO
     *                      DTO object that contains the DATA to be replaced
     * @param newTeacherDTO
     *                      DTO object that contains the new DATA, replacing
     *                      oldTeacherDTO
     * @throws SQLException
     *                      If any error occurs during SQL delete we get an
     *                      exception.
     */
    void updateTeacher(TeacherDTO oldTeacherDTO, TeacherDTO newTeacherDTO)
            throws SQLException;

    /**
     * Gives back to the caller a list of {@link Teacher} objects identified
     * by their last name.
     * 
     * @param lastname
     *                 a string object that contains the lastname of
     *                 the teachers to be retrieved.
     * @return
     *         a list that contains the result of the called method or
     *         an empty list if no results were found.
     * @throws SQLException
     *                      If any error occurs during SQL select we get an
     *                      exception.
     */
    List<Teacher> getTeachersByLastName(String lastname)
            throws SQLException;

    /**
     * Searches the database for a {@link Teacher}
     * 
     * @param id
     *           Parameter that is used for the search.
     * @return
     *         Returns a {@link Teacher} or null.
     * @throws SQLException
     *                                  If any error occurs during SQL select we get
     *                                  an
     *                                  exception.
     * @throws TeacherNotFoundException
     *                                  if any teacher, identified by their id is
     *                                  not found.
     */
    Teacher getTeacherId(int id)
            throws SQLException, TeacherNotFoundException;
}
