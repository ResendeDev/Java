
package ExemplosDeFuncoes;

import java.util.Scanner;

public class ExemploSubtracao {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println ("Entre com o primeiro valor: ");
        double valor1 = scan.nextDouble();
        
        System.out.println ("Entre com o segundo valor: ");
        double valor2 = scan.nextDouble();
        
        System.out.println("A subtração dos valores é " + subtracao(valor1, valor2));
        
    }
    
    public static double subtracao(double valor1, double valor2) {
        double subtracao = valor1 - valor2;
        return subtracao;
    }
}
