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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var pais = new Pais();
        var pais2= new Pais();
        //PAIS
        pais.setLimiteTerritorial(283.560);
        pais.setPoblacion(17.9862);
        pais2.setPoblacion(25.7853);
        pais.setContinente("Ecuador");
        pais2.setContinente("Italia");
        System.out.println("El pais es "+ pais.esContinenteEuropeo());
        System.out.println("El pais es "+ pais2.esContinenteEuropeo());
        System.out.println("La poblacion de Ecuador es "+ pais.getPoblacion());
        System.out.println("La poblacion de Italia es  "+ pais2.getPoblacion());
        System.out.println("El limite territorial es  "+ pais.getLimiteTerritorial());
        System.out.println("--------------------------------------------------------");
        
        var cuidad = new Ciudad();
        var cuidad2 = new Ciudad();
        //CUIDAD
        cuidad.setYearFundacion(1577);
        cuidad.setNumeroParroquias(24);
        cuidad.setNombre("Cuenca ");
        cuidad2.setYearFundacion(1535);
        cuidad2.setNumeroParroquias(21);
        cuidad2.setNombre("Guayaquil");
        
        System.out.println("Cuenca tiene "+ cuidad.calcularYearFundacion()+ " años");
        System.out.println("Cuenca tiene " + cuidad.getNumeroParroquias()+ " parroquias");
        System.out.println("---------------------------------------------------");
        System.out.println("Guayaquil tiene "+ cuidad2.calcularYearFundacion()+ " años");
        System.out.println("Guayaquil tiene "+ cuidad2.getNumeroParroquias()+ " parroquias");
        System.out.println("---------------------------------------------------");
        //CANTON
        var canton = new Canton();
        var canton2 = new Canton();
        
        canton.setYearFundacion(1860);
        canton.setNumeroTerminales(2);
        canton.setNombre("Paute ");
        canton2.setYearFundacion(1534);
        canton2.setNumeroTerminales(1);
        canton2.setNombre("Gualaceo");
        
        System.out.println(canton.getNombre()+"tiene "+ cuidad.calcularYearFundacion()+ " años");
        System.out.println(canton.getNombre()+" tiene " + canton.getNumeroTerminales()+ " terminales");
        System.out.println("---------------------------------------------------");
        System.out.println(canton2.getNombre()+"tiene "+ canton2.calcularYearFundacion()+ " años");
        System.out.println(canton2.getNombre()+" tiene "+ canton2.getNumeroTerminales()+ " terminal" );
        
    }
    
}
