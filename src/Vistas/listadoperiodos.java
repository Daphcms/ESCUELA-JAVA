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
public class listadoperiodos {
   ArrayList<Periodo>lista;
  
  public listadoperiodos(){
      lista=new ArrayList();
  }
  public void AgregarPeriodos(Periodo p){
      lista.add(p);
  }
}
