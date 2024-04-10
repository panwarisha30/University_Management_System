package university.management.system;

import java.sql.*;

public class Conn {
    @SuppressWarnings({"UseSpecificCatch", "CallToPrintStackTrace"})
    Connection c;
    Statement s;
    Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "Isha1513@");
            System.out.println("Connected With the database successfully"); 
            s = c.createStatement();
            
        } catch (Exception e) {
            System.out.println("Error while connecting to the database"); 
            e.printStackTrace();
        }
    }
}

