/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

/**
 *
 * @author daphne
 */
public class Carrera {
    private int CarreraId;
    private String Nombre;

    public Carrera() {
    }

    public Carrera(int CarreraId, String Nombre) {
        this.CarreraId = CarreraId;
        this.Nombre = Nombre;
    }

    public int getCarreraId() {
        return CarreraId;
    }

    public void setCarreraId(int CarreraId) {
        this.CarreraId = CarreraId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
