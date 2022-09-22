/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01_exercicio3;

import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class Atividade01_exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //delcarando variáveis
        String nome;
        int idade, gratis = 0, inteira = 0, meia = 0;
        double valorInteira, valorMeia, valorDiaria, total, totalInteira, totalMeia;

        //entrada de dados
        System.out.print("Informe o valor da diária: ");
        valorDiaria = scan.nextDouble();

        valorInteira = valorDiaria;
        valorMeia = (valorDiaria / 2);
        gratis = 0;

        System.out.print("Informe seu nome: ");
        nome = scan.next();
        
        //Estrutura de repetição while (enquanto)
        while (!"PARE".equals(nome)) {
            System.out.print("Informe sua idade: ");
            idade = scan.nextInt();

            if (idade < 4) {
                System.out.print(nome + " possui gratuidade: " + gratis++ + gratis + " gratuita(s)\n");
            } else if (idade >= 80) {
                System.out.print(nome + " paga meia igual " + valorMeia + " reais | " + meia++ + meia +" meia\n");
            } else if (idade > 4 && idade < 80) {
                System.out.print(nome + " paga inteira igual " + valorInteira + " reais | " + inteira++ + inteira +" inteira(s)\n");
            }
            System.out.print("\nInforme seu nome: ");
            nome = scan.next();
        }

        totalMeia = valorMeia * meia;
        totalInteira = valorInteira * inteira;
        total = totalMeia + totalInteira;

        System.out.print("\n O total de hospedagens: R$" + total + " reais | " + gratis + " gratuita(s), " + meia + " meia(s), " + inteira + " inteira(s)");

    }

}
