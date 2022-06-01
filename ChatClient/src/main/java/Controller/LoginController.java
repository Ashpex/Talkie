/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.DriverManager;
/**
 *
 * @author ashpex
 */
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class LoginController {
    public static boolean Login(String userName, String passWord) throws SQLException, ClassNotFoundException{
        boolean resuilt = false;
        String SQL = "SELECT username,userpassword FROM chatUser";
        Class.forName("org.mariadb.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/chatUser","root","ashpex123");
        
        PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            if(resultSet.getString(1).equals(userName) && resultSet.getString(2).equals(passWord)){
                resuilt = true;
            }
        }
        connection.close();
        resultSet.close();
        preparedStatement.close();
        return resuilt;
    }
    
}
