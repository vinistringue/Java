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
public class hospedagem {
    
    public String descricao;
    public double valorHospedagem;
    
    public double valorDiaria (double valor){
        this.valorHospedagem = valor;
        return valor;
    }
    
}
