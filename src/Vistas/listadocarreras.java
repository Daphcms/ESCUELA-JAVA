/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import java.util.ArrayList;

/**
 *
 * @author daphne
 */
public class listadocarreras {
    ArrayList<Carrera>lista;
     
     public listadocarreras(){
      lista=new ArrayList();
     }
     public void AgregarCarrera(Carrera c){
      lista.add(c);
  }
    
}
