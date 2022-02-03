import java.io.BufferedInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class App {
    public static void main(String[] args) throws Exception {
            try{
                Connection con;
                con= ConnDB.creatConnection();
                Statement stmt;
                stmt=con.createStatement();
                String query="select * FROM account";
                ResultSet result=stmt.executeQuery(query);
                System.out.println(con.getClientInfo());
                while(result.next()){
                    int id;
                    String name,password,type;
                    id=result.getInt(1);
                    name=result.getString(2);
                    password=result.getString(3);
                    type=result.getString(4);
                    System.out.println(id+"\t"+name+"\t"+password+"\t"+type);
                }
    
            }catch(Exception e){
                e.getMessage();
            }
    }
}
