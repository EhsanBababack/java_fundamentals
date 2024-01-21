package ir.sadad.jdbcexample;

import java.sql.*;
import java.util.ResourceBundle;

public class MySqlConnectionWithCreateStatement {
    ResourceBundle bundle = ResourceBundle.getBundle("DB");
    private String MYSQL_DRIVER = bundle.getString("MYSQL_DRIVER");;


    private Connection con;
    private Statement st;
    private ResultSet rs;

    public MySqlConnectionWithCreateStatement() {

        try {
            Class.forName(MYSQL_DRIVER);
            System.out.println("Class Loaded....");
//            con = DriverManager.getConnection(MYSQL_URL, "root", "123456");
            con = SingletonDBConn.getSingletonConn();
            System.out.println("Connected to the database....");
            st = con.createStatement();
            int c = st.executeUpdate("CREATE TABLE Accounts_LOG (Name VARCHAR(30))");
            System.out.println("Table have been created.");
            System.out.println(c + " Row(s) have been affected");
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
        new MySqlConnectionWithCreateStatement();
    }
}

