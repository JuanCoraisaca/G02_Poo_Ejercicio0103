/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.g02_poo_ejercicio_0103;

/**
 *
 * @author usuario
 */
public class Canton {
    private int yearFundacion;
    private int numeroTerminales;
    private String nombre;
    
    public  int calcularYearFundacion(){
        var retorno=1000;
        retorno=2022-this.yearFundacion;
        return retorno;
    }

    public int getYearFundacion() {
        return yearFundacion;
    }

    public void setYearFundacion(int yearFundacion) {
        this.yearFundacion = yearFundacion;
    }

    public int getNumeroTerminales() {
        return numeroTerminales;
    }

    public void setNumeroTerminales(int numeroTerminales) {
        this.numeroTerminales = numeroTerminales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pnombre) {
        this.nombre = pnombre;
    }

    
    
    
}
        
