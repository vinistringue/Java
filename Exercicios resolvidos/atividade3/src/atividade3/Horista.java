
package atividade3;


public class Horista extends Funcionario {
    private float horaTrabalhada;
    private double valorHora;

    @Override
    public double calcularPagamento() {
        
       double total = horaTrabalhada * valorHora;
       return total;
    }

    @Override
    public double aplicarAumento(int porcentagem) {
        
        double salario = calcularPagamento();
        return salario + (salario * porcentagem/100);
    }

    public Horista(float horaTrabalhada, double valorHora, String nome, String cpf, String endereco, String telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.horaTrabalhada = horaTrabalhada;
        this.valorHora = valorHora;
    }

    public Horista() {
    }
    
}
