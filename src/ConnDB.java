import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnDB {
    public static Connection con;
    public static Connection creatConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyrus_db","root", "");
        } catch (Exception e) {
            //TODO: handle exception
            e.getMessage();
        }
        return con;
    }
}
