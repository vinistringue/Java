package atividade4uc6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade4uc6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Pagamentos paga = new Pagamentos();
        Pis pis = new Pis(0.0f, 0.0f);
        Ipi ipi = new Ipi(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        String opcao;

        do {
            System.out.println("---- Bem vindo ao Sistema de Tributos---- \n");

            System.out.println("Digite 1 para PIS:\nDigite 2 para IPI:\nDigite PARE finalizar:\n");
            opcao = entrada.nextLine();

            if (opcao.equals("PIS")) {
                System.out.println("Digite o nome da empresa:");
                paga.listapaga.add(entrada.nextLine());
                System.out.println("Digite o valor do debito:");
                pis.setDebito(entrada.nextDouble());
                System.out.println("Digite o valor de credito:");
                pis.setCredito(entrada.nextDouble());

                pis.calcular(pis.getDebito(), pis.getCredito());

                paga.listapis.add(pis.totalimpostopis);

            } else if (opcao.equals("IPI")) {
                System.out.println("Digite o nome da empresa:");
                paga.listapaga.add(entrada.nextLine());
                System.out.println("Digite aliquoa:");
                ipi.setAliquoa(entrada.nextFloat());
                System.out.println("Digite o valor do produto:");
                ipi.setValorProduto(entrada.nextFloat());
                System.out.println("Digite o valor frete:");
                ipi.setFrete(entrada.nextFloat());
                System.out.println("Digite o valor do seguro:");
                ipi.setSeguro(entrada.nextFloat());
                System.out.println("Digite valor de outras depesas ou 0 quando nao haver:");
                ipi.setOutrasDespesas(entrada.nextFloat());

                ipi.calcularIpi(ipi.getAliquoa(), ipi.getValorProduto(), ipi.getFrete(), ipi.getSeguro(), ipi.getOutrasDespesas());

                paga.listaipi.add(ipi.totalimpostoipi);
            }

        } while (!"PARE".equals(opcao));
        
        System.out.println("--- FINALIZANDO... ---");
        
        paga.imprimirEmpresa();
        paga.imprimirPis();
        paga.imprimirIpi();

    }

}
    

