/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DAO {
public static Connection con;
public DAO(){ 
    if(con == null){
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/libman";
        String dbClass = "com.mysql.jdbc.Driver";
        try {
            Class.forName(dbClass);
            con = DriverManager.getConnection (dbUrl, "root","huongcam123@");
        }catch(ClassNotFoundException | SQLException e) {
        }
    }
}
}
