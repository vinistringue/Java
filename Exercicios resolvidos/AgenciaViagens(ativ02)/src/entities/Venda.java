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
public class Venda {
    
    public String nomeCliente;
    public String formaPagamento;
    public double pacoteViagem;
    public double cotacaoDolar;
    
    public double converter (double pacoteViagem, double dolar){
        this.pacoteViagem = pacoteViagem * cotacaoDolar;
        return this.pacoteViagem;
    }
    
}
