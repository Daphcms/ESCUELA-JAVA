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
public class CRUD {
      public void insertaDato (String Nombre,String APaterno,String AMaterno,int Aniolngreso,int PeriodoId ,
    String Celular,String Email,Date FechaNacimiento,int CarreraId){
        String query = "insert into Estudiante(Nombre,APaterno,AMaterno,Aniolngreso,PeriodoId,Celular,Email,FechaNacimiento,CarreraId) value(?,?,?,?,?,?,?,?,?)";

//(String nombre, Double costo, int idFabricante){
       // String query = "insert into producto(nombre, costo, idFabricante) value(?,?,?) ";
        try{
            Connection con= dbConnection.conectar();
            PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1, Nombre);
            ps.setString(2, APaterno);
            ps.setString(3, AMaterno);
            ps.setInt(4, Aniolngreso );
            ps.setInt(5, PeriodoId);
            ps.setString(6, Celular);
            ps.setString(7, Email);
            ps.setDate(8, FechaNacimiento);
            ps.setInt(9, CarreraId);
            
            ps.executeUpdate();
            System.out.println("Dato insertado con exito");
    }
        catch(SQLException ex)
    {
        System.out.println("Error al insertar dato");
        ex.printStackTrace();      
    }  
}//fin de insertar dato
    
    public void eliminarDato (int EstudianteId)
{
    String query = "delete from Estudiante where EstudianteId =? ";
    try{
        Connection con= dbConnection. conectar () ;
        PreparedStatement ps = con. prepareStatement (query) ;
        ps.setInt (1, EstudianteId);
        
        ps.executeUpdate () ;
        System. out.println ("Dato eliminado con exito") ;
    }
catch (SQLException ex)
   {
System. out.println ("Error al eliminar dato");
ex.printStackTrace ();
   } 
}//findeeliminardato
    
public void leerDatos ( )
{     String query = "select * from Estudiante";
    try{
        Connection con= dbConnection. conectar () ;
        PreparedStatement ps = con.prepareStatement (query) ;
        ResultSet rs = ps. executeQuery ( ) ;
            while (rs.next () ) {
                int idEstudiante = rs.getInt ("idEstudiante" ) ;
            String Nombre = rs.getString ("Nombre" );
            String APaterno = rs.getString ("APaterno");
            String AMaterno = rs.getString ("AMaterno");
            int Aniolngreso  = rs.getInt ("Aniolngreso" );
            int PeriodoId = rs.getInt ("PeriodoId" );
            int Celular = rs.getInt ("Celular" );
            String Email = rs.getString ("Email");
            Date FechaNacimiento = rs.getDate ("FechaNacimiento" );
            int CarreraId = rs.getInt ("CarreraId" );
            
            System. out. println ("ID: "+ idEstudiante + " | Nombre: "+
            Nombre+ " | APaterno: "+ APaterno+ " | AMaterno: "+AMaterno+ " | Aniolngreso: "
            +Aniolngreso+ " | PeriodoId: "+PeriodoId+ " | Celular: "+Celular+ " | Email: "
            +Email+ " | FechaNacimiento: "+FechaNacimiento+  " |CarreraId: "+CarreraId) ;
        }
    }
    catch (SQLException ex)
    {
        System. out. println ("Error al mostrar los datos") ;
        ex.printStackTrace () ;
    }
}//fin leer datos

public void actualizarDatos (int idEstudiante, String Nombre){
String query = "update Estudiante set Nombre =? where idEstudiante =? ";
try{
   Connection con= dbConnection. conectar () ;
   PreparedStatement ps = con.prepareStatement (query) ;
   ps.setString (1, Nombre);
   ps. setInt (2, idEstudiante) ;
   
   ps. executeUpdate () ;
   System. out.println ("Dato actualizado con exito") ;
}
catch (SQLException ex)
{
    System. out. println ("Error al actualizar dato") ;
    ex. printStackTrace ( ) ;
    }
}//fin de actualizar dato

    
    
}
