/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ashpex
 */
public class RegisterController {
    public static boolean Register(String userName, String passWord) throws SQLException, ClassNotFoundException{
        boolean result = true;
        String SQL = "INSERT INTO chatUser VALUES (?,?)";
        Class.forName("org.mariadb.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/chatUser","root","ashpex123");
         PreparedStatement ps = null;
        try {
            
        
      
       ps = connection.prepareStatement(SQL);
       ps.setString(1,userName);
       ps.setString(2, passWord);
       int row = ps.executeUpdate();
       
       if(row < 1){
           result = false;
       }
       } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
       connection.close();
       ps.close();
       return result;
    }
}
