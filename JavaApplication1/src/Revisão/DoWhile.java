package Revisão;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        boolean terminar = false;
        do{
            System.out.println("\nValor a adicionar: ");
            int valor = scan.nextInt();

            if(valor > 0) {
                total += valor;
            }else{
                System.out.println("\n---- Valor inválido. ----");
                terminar = true;
            }
            if(total > 20) {
                terminar = true;
            }
            System.out.println("\nTotal: {" + total + "}");

        }while (terminar != true);

        System.out.println("\nFim!");
    }
}
