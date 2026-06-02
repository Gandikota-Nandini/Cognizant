import java.sql.*;
public class StudentDAO {

    Connection getConnection() throws Exception {

        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "root");
    }

    void insertStudent(int id, String name)
            throws Exception {

        Connection con = getConnection();

        PreparedStatement ps =
                con.prepareStatement(
                        "INSERT INTO students VALUES (?,?)");

        ps.setInt(1, id);
        ps.setString(2, name);

        ps.executeUpdate();

        con.close();
    }

    void updateStudent(int id, String name)
            throws Exception {

        Connection con = getConnection();

        PreparedStatement ps =
                con.prepareStatement(
                        "UPDATE students SET name=? WHERE id=?");

        ps.setString(1, name);
        ps.setInt(2, id);

        ps.executeUpdate();

        con.close();
    }
}