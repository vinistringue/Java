/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviagens.ativ02;

import entities.Venda;
import entities.hospedagem;
import entities.pacote_viagem;
import entities.transporte;
import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class AgenciaViagensAtiv02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String opcao = null;
        double totalPacote;
        while (!"s".equals(opcao)) {
            //Interação com usuário, iniciando cadastro de uma venda
            System.out.print("Deseja criar um pacote de viagem (s/n)? ");
            opcao = scan.nextLine();

            transporte t = new transporte();
            pacote_viagem pv = new pacote_viagem();
            Venda v = new Venda();

            System.out.print("Qual será o destino? ");
            pv.destino = scan.nextLine();

            System.out.print("Qual será o meio de transporte? ");
            t.tipo = scan.nextLine();

            System.out.print("Valor do transporte: ");
            t.valorTransporte = scan.nextDouble();

            System.out.print("Valor diaria da hospedagem: ");
            pv.valorHospedagem = scan.nextDouble();

            System.out.print("Quantas diárias? ");
            pv.qntdDias = scan.nextInt();

            System.out.print("Lucro do pacote(porcentagem): ");
            pv.valorPorcentagem = scan.nextDouble();

            System.out.print("Nome cliente: ");
            v.nomeCliente = scan.next();

            System.out.print("Forma de pagamento: ");
            v.formaPagamento = scan.next();

            System.out.print("Cotação do dólar: ");
            v.cotacaoDolar = scan.nextDouble();

            double totalHospedagem = (pv.valorHospedagem * pv.qntdDias);
            double porcentagem = (totalHospedagem) * (pv.valorPorcentagem / 100);
            double totalHospDolar = totalHospedagem + porcentagem + t.valorTransporte;

            totalPacote = (t.valorTransporte + totalHospedagem + porcentagem) * v.cotacaoDolar;

            System.out.printf("\nNome cliente: " + v.nomeCliente + "\n"
                    + "Forma de pagamento: " + v.formaPagamento
                    + "\nTotal pacote em dólar: $" + totalHospDolar
                    + "\nTotal do pacote: R$" + totalPacote + " reais");
        }
    }
}
