/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuelabd;
import java.sql.*;
/**
 *
 * @author daphne
 */
public class dbConnection {
     static String url="jdbc:mysql://localhost:3306/EscuelaDB";
    static String user= "root";
    static String pass= "";
            
         public static Connection conectar(){
             Connection con = null;
             try {
                con=DriverManager.getConnection(url,user, pass);
                System.out.println("conexion exitosa");   
         }catch(SQLException e)
         {
             e.printStackTrace();
         } 
     return con;
         }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
