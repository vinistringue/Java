/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservaauditorio;

import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class ReservaAuditorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);
        
        //Declarando variáveis
        int alfa, beta, pessoas;
        
        System.out.println(" ---- RESERVA DE AUDITÓRIO ---- \n");
        System.out.print("Informe a quantidade de pessoas: ");
        pessoas = scan.nextInt();
        
        //Atribuindo valores as variáveis
        alfa = 220;     
        beta = 350;
        
        
        if (pessoas >= 221 && pessoas <=350){
            System.out.println("Usar auditório Beta");
        } else if (pessoas <=0){
            System.out.println("Número de convidados inválidos");
        } else if (pessoas <= 150){
            System.out.println("Usar auditório Alfa");
        } else if (pessoas > 150 && pessoas <= 220){
            System.out.println("Usar auditório Alfa");
            System.out.println("Inclua mais " + Integer.toString(pessoas - 150) + " cadeiras no auditório");
        } else {
            System.out.println("CAPACIDADE DE CONVIDADOS SUPERIOR A CAPACIDADE MÁXIMA");
        }
    }
    
}
