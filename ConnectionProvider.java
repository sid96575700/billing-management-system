/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenova
 */
public class ConnectionProvider {
    public static Connection getCon() throws ClassNotFoundException
    {
        
            Connection con=null;
            try {
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            con=DriverManager.getConnection("jdbc:mysql://localhost/bmi","root","123456789");
  
            }catch(ClassNotFoundException ex){
                System.out.println(ex);
            }
         catch (SQLException ex)
         {
    
        System.out.println(ex);
        }
        return con;
    }}