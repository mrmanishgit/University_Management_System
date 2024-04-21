package university.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    Conn () {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection c = DriverManager.getConnection
                                        ("jdbc:oracle:thin:@localhost:1521:orcl","TEST3","123");
           // Class.forName("com.mysql.cj.jdbc.Driver");
           // c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "codeforinterview");
            s = c.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
