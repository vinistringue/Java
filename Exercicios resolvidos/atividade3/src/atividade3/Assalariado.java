
package atividade3;


public class Assalariado extends Funcionario {
    
    private double salario;


    @Override
    public double calcularPagamento() {
        return salario;
    }

    @Override
    public double aplicarAumento(int porcentagem) {
        
         return salario + (salario * porcentagem / 100);
    }


    public Assalariado(double salario, String nome, String cpf, String endereco, String telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
    
}
