package ir.sadad.jdbcexample;

import java.sql.*;
import java.util.ResourceBundle;


public class MySqlConnectionWithPreparedStatement {
    ResourceBundle bundle = ResourceBundle.getBundle("DB");
    private String MYSQL_DRIVER = bundle.getString("MYSQL_DRIVER");;

    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement pstmt;

    public MySqlConnectionWithPreparedStatement() {

        try {
            Class.forName(MYSQL_DRIVER);
            System.out.println("Class Loaded....");
            String SQL = "Update ehsan SET age = 100 WHERE id = 11223344";
            String QUERY = ("UPDATE ehsan SET age=? WHERE id=?");

//            con = DriverManager.getConnection(MYSQL_URL, "root", "123456");
            con = SingletonDBConn.getSingletonConn();
            System.out.println("Connected to the database....");
            pstmt = con.prepareStatement(QUERY);
            pstmt.setInt(1, 65);
            pstmt.setString(2, "11223344");
            pstmt.executeUpdate();

            System.out.println("Table have been updated.");
            con.close();

        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException:\n" + ex.toString());
            ex.printStackTrace();

        } catch (SQLException ex) {
            System.out.println("SQLException:\n" + ex.toString());
            ex.printStackTrace();
        }
    }

    public static void main(String... args) {
        new MySqlConnectionWithPreparedStatement();
    }

}
