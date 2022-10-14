/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author vinic
 */
public class transporte {
    
    public String tipo;
    public double valorTransporte;
    
    public double viagem (double valor){
        this.valorTransporte = valor;
        return valor;
    }
}
