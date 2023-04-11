
package Revisão;

import java.util.Scanner;

public class While{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        
         int cont = 0;
        
        while(num != 0){
            if( num >= 100 && num <= 300){
                cont++;    
            }
            System.out.print("Digite um número ");
            num = scan.nextInt();
        }
        
        System.out.println("A quantidade de números entre 100 e 300 é " + cont );
        
    }
            
}





