package Student_Management_System_Project;

import java.sql.*;
public class Conn {
Connection c ;
Statement s;
    Conn (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql:///studentmanagementsystem","root","anurag@123");
        s = c.createStatement();
        
        
        }
        
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
