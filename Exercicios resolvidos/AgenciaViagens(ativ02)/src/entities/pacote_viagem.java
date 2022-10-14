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
public class pacote_viagem {
    
    transporte t = new transporte();
    Venda v = new Venda();
    
    public String tipo;
    public double valorHospedagem;
    public String destino;
    public int qntdDias;
    public double valorDolar;
    public double valorPorcentagem;
    public double totalPacote;
    
    
    //Calcular o total de hospedagem a partir do número de dias e o valor da diária.
    public  double totalHospedagem (double valor, int qntd){
        this.valorHospedagem = valor;
        this.qntdDias = qntd;
        return valor * qntd;
    }
    
    /*Calcular valor de lucro a partir de uma margem informada (porcentagem) e valor informado. 
    O resultado retornado deve ser o valor + margem aplicada ao valor.*/
    public double calcularLucro (int porcentagem, double valor){
        this.valorHospedagem = valor;
        this.valorPorcentagem =  valor * (porcentagem/100) + valor;
        return valorPorcentagem;
       
    }
    
    /*Calcular e retornar o total do pacote, somando o transporte, o total da hospedagem 
e valores adicionais informados – margem de lucro (porcentagem) e taxas adicionais (valor monetário).*/
    public double totalPacote (double valorTransporte, double totalHospedagem, double lucro){
        return this.totalPacote = (this.t.valorTransporte + this.valorHospedagem + this.valorPorcentagem) / this.v.cotacaoDolar;   
    }
    
}
