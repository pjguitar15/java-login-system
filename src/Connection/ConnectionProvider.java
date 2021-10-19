/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;
import java.sql.*;
/**
 *
 * @author pjgui
 */
public class ConnectionProvider {
    public static Connection getConn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");    
            return conn;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }        
    }
}
