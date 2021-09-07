/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.utility;

import com.main.view.Registration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gunnnu
 */
public class DBConnecction {
    
    public static Connection getconnection(){
        Connection   con = null;
    try{
            Class.forName("com.mysql.jdbc.Driver");
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_newfreshproject","root","");
            if (con!= null){
            
                System.out.println("connected");
            }  
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("error : "+e);
        }
        return con;
        }
    
    public static PreparedStatement preStateMent(String sql) throws SQLException, ClassNotFoundException {
        return getconnection().prepareStatement(sql);
    }
    public static void main(String[] args) {
        getconnection();
    }

}
    
    

