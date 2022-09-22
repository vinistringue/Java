/*4. Monte um algoritmo em que o usuário poderá cadastrar e pesquisar 
hóspedes. O algoritmo deve oferecer um menu com três opções ao 
usuário: 1- cadastrar; 2- pesquisar; 3- sair. A opção “cadastrar” deve 
permitir que o usuário informe um nome de hóspede, gravando-o em 
memória (máximo de 15 cadastros; caso atinja essa quantidade, mostre 
“Máximo de cadastros atingido”). A opção “pesquisar” deve permitir que o 
usuário informe um nome e, caso seja encontrado um nome exatamente 
igual, mostre a mensagem “Hospede (nome) foi encontrado no índice 
(índice onde foi cadastrado)”. Se o nome não foi encontrado mostre 
“Hóspede não encontrado”. O algoritmo deve permitir que o usuário 
realize essas operações repetidas vezes, até que use a opção “3”, que 
encerra o algoritmo.*/
package atividade01_exercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class Atividade01_exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome[] = new String[15];
       
        String pesquisa = "";
        int opcao, i = 0;
        boolean achou;

        System.out.println("---- CADASTRO DE CLIENTES ----\n");

        do {
            System.out.print("\n (1)- Cadastrar; (2)- Pesquisar; (3)- Sair;\n");
            opcao = scan.nextInt();
            //Condição para acessar o menu acima 
            if (opcao == 1) {               //Menu opção 1 (Cadastrar)
                if (i > 14) {
                    System.out.print("Limite máximo de cadastros\n");
                } else {
                    System.out.println("\nInforme o nome do hóspede: ");
                    nome[i] = scan.next();
                    i++;
                }
            } else if (opcao == 2) {        //Menu opcção 2 (Pesquisar)
                System.out.print("\nPesquise o nome do hóspede desejado: ");
                pesquisa = scan.next();

                achou = false;
                for (i = 0; i < 15; i++) {
                    if (pesquisa.equals(nome[i])) {
                        System.out.print("\nHóspede " + nome[i] + " encontrado na posição " + i + "\n");
                        achou = true;
                        break;
                    }
                }
                for (i = 0; i < 15; i++) {
                    if (achou == false) {
                        System.out.print("\nHóspede " + pesquisa + " não encontrado!\n");
                        break;
                    }
                }
            }
        }while (opcao != 3);
       
        System.out.println("\nPROGRAMA FINALIZADO!");
    }
}
