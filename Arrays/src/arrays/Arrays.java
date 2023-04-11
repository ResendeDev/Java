package arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cond = 3;
        double sum = 0;

        String names[] = new String[cond];
        int registration[] = new int[cond];
        double notes[] = new double[cond];

        System.out.println("Nomes.");
        for (int i = 0; i < cond; i++) {
            System.out.print("Entre com o " + (i+1) + "º nome: ");
            names[i] = scan.next();

        }

        System.out.println("Matricula.");
        for (int i = 0; i < cond; i++) {
            System.out.print("Entre com a " + (i+1) + "ª matricula: ");
            registration[i] = scan.nextInt();
        }

        
        System.out.println("Notas.");
        for (int i = 0; i < cond; i++) {
            System.out.print("Entre com a " + (i+1) + "ª nota: ");
            notes[i] = scan.nextDouble();
            sum += notes[i];
        }
        
        double average = sum /cond;
        
        System.out.println("Aprovados.");
        for (int i = 0; i < cond; i++) {
            if (notes[i] >= average) {
                System.out.println("O aluno " + names[i] + "da matricula Nº" + registration[i] + " é superior que a média!\n" + notes[i]);
            }

        }

    }
}
