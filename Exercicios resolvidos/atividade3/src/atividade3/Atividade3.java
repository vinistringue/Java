package atividade3;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "n";
        int i = 0;
        Funcionario funcionario[] = new Funcionario[10];

        do {
            String tipoContrato;
            System.out.println("Tipo de contrato: assalariado ou horista");
            tipoContrato = sc.next();
            sc.nextLine();

            if (i == 10) {
                System.out.println("\nNúmero maximo atingido\n");

                break;
            } else if ("assalariado".equals(tipoContrato)) {

                System.out.println("Informe o nome: ");
                String nome = sc.nextLine();
                System.out.println("Informe o cpf: ");
                String cpf = sc.nextLine();

                System.out.println("Informe o endereço: ");
                String endereco = sc.nextLine();
                System.out.println("Informe o telefone: ");
                String telefone = sc.nextLine();

                System.out.println("Informe o setor em que trabalha: ");
                String setor = sc.nextLine();
                System.out.println("Informe o salário: ");
                double salario = sc.nextDouble();

                funcionario[i] = new Assalariado(salario, nome, cpf, endereco, telefone, setor);
                funcionario[i].mostrarDados();
                System.out.println("Salário: " + String.format("%.3f", funcionario[i].calcularPagamento()));
                i++;
            } else if ("horista".equals(tipoContrato)) {

                System.out.println("Informe o nome: ");
                String nome = sc.nextLine();
                System.out.println("Informe o cpf: ");
                String cpf = sc.nextLine();

                System.out.println("Informe o endereço:");
                String endereco = sc.nextLine();
                System.out.println("Informe o telefone: ");
                String telefone = sc.nextLine();

                System.out.println("Informe o setor em que trabalha:");
                String setor = sc.nextLine();

                System.out.println("Informe a quantidade de horas trabalhadas: ");
                float horaTrabalhada = sc.nextFloat();
                System.out.println("Informe o valor da hora: ");
                double valorHora = sc.nextDouble();

                funcionario[i] = new Horista(horaTrabalhada, valorHora, nome, cpf, endereco, telefone, setor);
                funcionario[i].mostrarDados();
                System.out.println("Salário: " + String.format("%.3f", funcionario[i].calcularPagamento()));
                i++;
            }
            System.out.println("");
            System.out.println("Deseja continuar (s/n)? ");
            continuar = sc.next();
            sc.nextLine();

        } while ("s".equals(continuar));

        for (i = 0; i < 10; i++) {

            if (funcionario[i] == null) {
                break;
            } else {
                funcionario[i].mostrarDados();
                System.out.println("Salário: " + String.format("%.3f", funcionario[i].calcularPagamento()));
                System.out.println("");
            }
        }
        System.out.println("Informe a porcentagem de aumento para aplicar:");
        int aumento = sc.nextInt();

        for (i = 0; i < 10; i++) {
            if (funcionario[i] == null) {
                break;
            } else {

                System.out.println("Funcionário: " + funcionario[i].getNome());
                System.out.println("Salário após  o aumento: " + String.format("%.3f", funcionario[i].aplicarAumento(aumento)));
                System.out.println("");
            }
        }

    }

}
