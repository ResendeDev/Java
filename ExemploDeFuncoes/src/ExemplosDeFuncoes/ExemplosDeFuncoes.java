
package ExemplosDeFuncoes;

import java.util.Scanner;

public class ExemplosDeFuncoes {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o valor: ");
        int num = scan.nextInt();
        
        procuraImparPar(num);
        
        
    } 
    
    public static void procuraImparPar(int numero) {
        if(numero % 2 == 0) {
            System.out.println(numero + " é par!");
        }else {
            System.out.println(numero + " é impar!");
        }
    }
}
