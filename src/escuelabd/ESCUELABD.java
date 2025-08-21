/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escuelabd;
import java.sql.*;
/**
 *
 * @author daphne
 */
public class ESCUELABD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dbConnection dbc = new dbConnection();
       //dbc.conectar();
       
        CRUD operaciones = new CRUD();

        //Fecha en formato java.sql.Date
        Date fechaNac = Date.valueOf("2025-05-24"); // AAAA-MM-DD

        operaciones.insertaDato(
          "Lira", 
            "Perez", 
            "Cancino", 
            2020, 
            2, 
            "5545843752", 
            "perezlira34@gmail.com",  
            fechaNac, 
            4 );
    }
    
}
