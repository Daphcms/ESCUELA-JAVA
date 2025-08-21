/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

/**
 *
 * @author daphne
 */
public class Periodo {
    private int PeriodoId;
    private String NombrePeriodo;

    public Periodo() {
    }

    public Periodo(int PeriodoId, String NombrePeriodo) {
        this.PeriodoId = PeriodoId;
        this.NombrePeriodo = NombrePeriodo;
    }

    public int getPeriodoId() {
        return PeriodoId;
    }

    public void setPeriodoId(int PeriodoId) {
        this.PeriodoId = PeriodoId;
    }

    public String getNombrePeriodo() {
        return NombrePeriodo;
    }

    public void setNombrePeriodo(String NombrePeriodo) {
        this.NombrePeriodo = NombrePeriodo;
    }
    
    
}
