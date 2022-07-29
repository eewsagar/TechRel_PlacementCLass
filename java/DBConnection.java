/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.database;

/**
 *
 * @author sagarverma
 */
import java.sql.*;

public class DBConnection {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/db_registration", "root", "");
            Statement stmt = con.createStatement();
            ReadData(stmt);
            UpdateData(stmt);
            InsertData(stmt,"Harry", "Lal", 34, "harry", "harry", 909090);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);

        }
    }

    public static void ReadData(Statement stmt) {

        
        try {
                ResultSet rs = stmt.executeQuery("select * from tbl_user");
                while (rs.next()) {
                    System.out.println(rs.getString(1) + "" + rs.getString(2) + "" + rs.getString(3));
                }
            

        } catch (SQLException e) {
            System.out.println(e);

        }

    }

    public static void UpdateData(Statement stmt) {

        try {
                     String query = "UPDATE `tbl_user` SET `age` = '34' WHERE `tbl_user`.`txtfirstname` = 'tom';"; 
                     stmt.executeUpdate(query);
                    System.out.println("Data is update succefully");

        }catch (SQLException e) {
            System.out.println(e);

        }

    }

    public static void InsertData(Statement stmt,String firstname, String lastname, int age, String username, String password, int mobile) {

        try {
           

                String query = "INSERT INTO `tbl_user` (`txtfirstname`, `txtlastname`, `age`, `txtusername`, `txtpassword`, `mobilenumber`) "
                        + "VALUES ('" + firstname + "', '" + lastname + "', '" + age + "', '" + username + "', '" + password + "', '" + mobile + "');";
                stmt.execute(query);
                System.out.println("Data is inserted succefully");
            

        } catch (SQLException e) {
            System.out.println(e);

        }

    }
}
