
package bank.system;
import java.sql.*;

public class Connect {
    Connection c;
    Statement s;
    public Connect(){
        try{
            //Class.forName(com.mysql.cj.jdbc.Driver);
            c=DriverManager.getConnection("jdbc:mysql:///banksystem","root","819121");
            s=c.createStatement();
            
        }
        catch(Exception e){
            System.out.println(e);
            
        }
            
     }
    
}
