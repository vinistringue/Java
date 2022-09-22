/*
Exercicio 2
 2. Escreva um programa Java que faça a troca de quartos entre dois hospedes. 
Receba o nome de um cliente e sua idade; ele a princípio será hospedado no quarto A.
Depois receba o nome de outro cliente e sua idade; se ele for mais jovem, ficará
no quarto B, mas se for velho que o primeiro cliente, ele ficará no quarto A e 
o primeiro cliente ficará no quarto B. Além disso, se a pessoa mais velha for idosa 
(tem 60 anos ou mais)terá desconto de 40%. Mostre ao final o nome do cliente que
ficou no quarto A e o desconto, se possuir, e qual ficou no quarto B.
 */
package program;

import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o nome do hóspede A: ");
        String hospedeA = scan.next();
        System.out.print("Informe a idade da(o) " + hospedeA + ": ");
        int idadeA = scan.nextInt();

        System.out.print(hospedeA + " ficará hospedado no quarto A\n\n");

        System.out.print("Informe o nome do hóspede B: ");
        String hospedeB = scan.next();
        System.out.print("Informe a idade da(o) " + hospedeB + ": ");
        int idadeB = scan.nextInt();

        //Condição para verificar idade 
        if (idadeA > idadeB) {
            System.out.print("Quarto B: " + hospedeB);
        } else if ((idadeB > idadeA) && (idadeA >= 60 || idadeB >= 60)) {
            System.out.println("Quarto A: " + hospedeB + "; Quarto B: " + hospedeA);
        }

    }

}
