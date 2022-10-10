package gr.aueb.sev.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static gr.aueb.sev.dao.dbutil.DBUtil.*;
// import static gr.aueb.sev.dao.dbutil.DBUtil.getConnection;
// import static gr.aueb.sev.dao.dbutil.DBUtil.CloseConnection;

import gr.aueb.sev.model.Teacher;

public class TeacherDAOImpl implements ITeacherDAO {

    @Override
    public void insert(Teacher teacher) throws SQLException {
        PreparedStatement pst = null;
        Connection conn = getConnection();

        try {
            String sql = "INSERT INTO teachers (firstname, lastname) VALUES (?, ?)";
            // + "'" + teacher.getFirstname() + "'," + "'" + teacher.getLastname()+ "'";

            pst = getConnection().prepareStatement(sql);

            pst.setString(1, teacher.getFirstname());
            pst.setString(2, teacher.getLastname());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (!pst.isClosed())
                pst.close();
            if (conn != null)
                CloseConnection();
        }
    }

    @Override
    public Teacher delete(Teacher teacher) throws SQLException {
        PreparedStatement pst = null;
        Connection conn = getConnection();

        try {
            String sql = "DELETE FROM teachers WHERE id = ?";
            // + "'" + teacher.getFirstname() + "'," + "'" + teacher.getLastname()+ "'";

            pst = getConnection().prepareStatement(sql);

            pst.setInt(1, teacher.getId());

            int n = pst.executeUpdate();

            return n != 0 ? teacher : null;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (!pst.isClosed())
                pst.close();
            if (conn != null)
                CloseConnection();
        }
    }

    @Override
    public void update(Teacher oldTeacher, Teacher newTeacher) throws SQLException {
        PreparedStatement pst = null;
        Connection conn = getConnection();

        try {
            String sql = "UPDATE teachers SET firstname = ?, lastname = ? WHERE id = ?";
            // + "'" + teacher.getFirstname() + "'," + "'" + teacher.getLastname()+ "'";

            pst = getConnection().prepareStatement(sql);

            pst.setString(1, newTeacher.getFirstname());
            pst.setString(2, newTeacher.getLastname());
            pst.setInt(3, oldTeacher.getId());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (!pst.isClosed())
                pst.close();
            if (conn != null)
                CloseConnection();
        }
    }

    @Override
    public List<Teacher> getTeachersByLastname(String lastname) throws SQLException {
        PreparedStatement pst = null;
        Connection conn = getConnection();
        List<Teacher> teachers = new ArrayList<>();
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM teachers WHERE lastname LIKE(?)";
            // + "'" + teacher.getFirstname() + "'," + "'" + teacher.getLastname()+ "'";

            pst = getConnection().prepareStatement(sql);

            pst.setString(1, lastname);

            rs = pst.executeQuery();

            while(rs.next()){
                teachers.add(
                    new Teacher(
                        rs.getInt("ID"),
                        rs.getString("FIRSTNAME"),
                        rs.getString("LASTNAME"))
                );
            }

            // return (teachers.size() > 0) ? teachers : null;
            return teachers;

        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (!pst.isClosed())
                pst.close();
            if (conn != null)
                CloseConnection();
        }
    }

    @Override
    public Teacher getTeacherById(int id) throws SQLException {
        PreparedStatement pst = null;
        Connection conn = getConnection();
        Teacher teacher = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM teachers WHERE id = ?";
            // + "'" + teacher.getFirstname() + "'," + "'" + teacher.getLastname()+ "'";

            pst = getConnection().prepareStatement(sql);

            pst.setInt(1, id);

            rs = pst.executeQuery();

            while(rs.next()){
                teacher =
                    new Teacher(
                        rs.getInt("ID"),
                        rs.getString("FIRSTNAME"),
                        rs.getString("LASTNAME"))
                ;
            }

            // return (teachers.size() > 0) ? teachers : null;
            return teacher;

        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (!pst.isClosed())
                pst.close();
            if (conn != null)
                CloseConnection();
        }
    }

}
