
package ExemplosDeFuncoes;

import java.util.Scanner;
public class ExemploMultiplicacao {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro valor: ");
        double valor1 =  scan.nextDouble();
        
        System.out.println("Entre com o segundo valor: ");
        double valor2 = scan.nextDouble();
        
        System.out.println("A multiplicação entre os valores é: " + multiplicacao(valor1, valor2));
    }
    
    public static double multiplicacao(double valor1, double valor2) {
        double multiplicacao =  valor1 * valor2;
        return multiplicacao;
    }
}
