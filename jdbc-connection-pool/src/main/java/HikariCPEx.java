import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HikariCPEx {

    public static void main(String[] args) {

        String configFile = "src/main/resources/db.properties";

        HikariConfig cfg = new HikariConfig(configFile);
        HikariDataSource ds = new HikariDataSource(cfg);

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            con = ds.getConnection();
            pst = con.prepareStatement("SELECT * FROM Cars");
            rs = pst.executeQuery();

            while (rs.next()) {

                System.out.format("%d %s %d %n", rs.getInt(1), rs.getString(2),
                        rs.getInt(3));
            }

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(HikariCPEx.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {

            try {

                if (rs != null) {
                    rs.close();
                }

                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }

                ds.close();

            } catch (SQLException ex) {

                Logger lgr = Logger.getLogger(HikariCPEx.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }
}