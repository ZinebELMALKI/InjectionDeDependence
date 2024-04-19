import javax.swing.*;
import java.sql.*;

public class ConnexionMysql {

    static Connection  conn =null;

    public static Connection ConnecDB() {
        try {
         //   Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/paiment", "root", "");
            return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
