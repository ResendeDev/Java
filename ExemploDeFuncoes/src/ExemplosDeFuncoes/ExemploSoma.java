
package ExemplosDeFuncoes;

import java.util.Scanner;

public class ExemploSoma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número: ");
        double valor1 = scan.nextDouble();
        
        System.out.println("Entre com o segundo número: ");
        double valor2 = scan.nextDouble();
      
        System.out.println("A soma entre os valores é " + soma(valor1, valor2));
    }
    
    
    public static double soma (double valor1, double valor2){
        double soma = valor1 + valor2;
        return soma;
    }
}
