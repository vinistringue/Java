/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01_ex05;

import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class Atividade01_ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String hotel[][] = new String[5][4];
        String quarto[] = {"", "Quarto 1", "Quarto 2", "Quarto 3"};
        String andar[] = {"", "1º Andar", "2º Andar", "3º Andar", "4º Andar"};

        int Andar, Quarto;
        char continuar;

        //Zerando a matriz 
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel.length; j++) {
                hotel[i][j] = " ";
                
        //Passando valor do vetor para matriz 
        for(int q=0; q<quarto.length; q++){
            hotel[0][q] = quarto[q];
        }
        
        //Passando o valor do vetor para matriz
        for(int a=0; a<andar.length; a++){
            hotel[a][0] = andar[a];
        }
        
                System.out.println(" ---- HOTEL JAVA ----");
                System.out.println("\nSistema de ocupação de quartos: ");
                
                do{
                    System.out.print("\nInforme o andar de 1 à 4: ");
                    Andar = scan.nextInt();
                    
                    System.out.print("\nInforme o quarto de 1 a 3: ");
                    Quarto = scan.nextInt();
                    
                    hotel[Andar][Quarto] = " X";
                    if(Quarto == 2){
                        hotel[Andar][Quarto] = " X";
                    }
                    else if (Quarto == 3){
                        hotel[Andar][Quarto] = " X";
                    }
                    
                    System.out.print("\nDeseja informar outra ocupação (S/N)? ");
                    continuar = scan.next().charAt(0);
                    
                } while(continuar != 'N');
                
                //Exibir na tela 
                
                for(i=4; i>=0; i--){
                    for(j=0; j<4; j++){
                        System.out.print(hotel[i][j]);
                        System.out.print("\t");
                    }
                    System.out.println("\n");
                }
            }
        }

    }

}
