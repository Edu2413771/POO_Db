/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class POO_Db{
     public static void main(String[] args) throws ClassNotFoundException, SQLException
 { 
    try {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pass = "cesba";
        System.out.println("Java Tratando de Conectar!!!");
        
        Class.forName(driver);
        
        Connection connection = DriverManager.getConnection(url, user, pass);
        
        System.out.println("Java Conectando...");
    }catch (Exception e)
    {
        e.printStackTrace();
    }
 }
    
}
