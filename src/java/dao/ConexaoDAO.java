package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ludwig Gonzaga
 */
public class ConexaoDAO {

    public static Connection conxaoDB() throws ClassNotFoundException {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql//localhost:3306/minhaloja?user=ludwig_gonzaga&password=SierraGolf@2020";
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println("e");
        }
        return con;

    }

}
