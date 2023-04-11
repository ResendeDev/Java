package arrays;
/*
02) Faça um programa que peça ao
usuário para digitar 10 números reais.
Ao final imprima cada valor na ordem
inversa à leitura.
*/

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 10;
        
        double array[] =  new double [cond];
        
        for (int i = 0; i < cond; i++){
            System.out.println("Digite o " + (i+1) + "º número.");
            array[i] = scan.nextDouble();
            
        }
// Pelo array começar contando no 0, utilizei cond-1 para começar na ultima casa que no caso seria 9 e não 10.
// cond = 10 -1 =9.
        for (int i = 0; i < cond; i++) {    
            System.out.println(array[(cond-1)-i]);
        }
    }
    
}
