/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

public class Horario {
    private int codigoHorario;
    private String descripcion;

    public Horario(int codigoHorario, String descripcion) {
        this.codigoHorario = codigoHorario;
        this.descripcion = descripcion;
    }

    public Horario() {
    }
    
    

    public int getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(int codigoHorario) {
        this.codigoHorario = codigoHorario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
