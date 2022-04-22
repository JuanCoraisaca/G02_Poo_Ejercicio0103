/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.g02_poo_ejercicio_0103_segundo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Pedido {
    private int pedidoEntregado;
    private Date fechaEntrega;
    private int pepidoEntregar;
    
    public int calcularPedidosTotales(){
        
        
        var retorno = this.pedidoEntregado + this.pedidoEntregado;
        
        return  retorno;
    
}

    public int getPedidoEntregado() {
        return pedidoEntregado;
    }

    public void setPedidoEntregado(int pedidoEntregado) {
        this.pedidoEntregado = pedidoEntregado;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getPepidoEntregar() {
        return pepidoEntregar;
    }

    public void setPepidoEntregar(int pepidoEntregar) {
        this.pepidoEntregar = pepidoEntregar;
    } 
}
