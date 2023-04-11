
package arrays;

/*
01) Faça um programa que:
• Crie um vetor de 4 posições
inicializados com valor 2 em cada
uma das posições.
• Atribua os valores 3,4,7,5 a cada
posição do vetor, respectivamente,
um a um.
• Percorra o vetor somando 4 ao
valor armazenado em cada posição.
• Imprima o vetor com valores
atualizados, um valor por linha.
*/

import java.util.Scanner;

public class Exercise1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cond = 4; 
        int sum = 0;  
        //int vet[] = new int[cond];
        int vet[] = {2,2,2,2};
        
        vet [0] = 3;
        vet [1] = 4;
        vet [2] = 7;
        vet [3] = 5;
       
        for( int i = 0; i < cond; i++){
             vet[i] += 4; 
            System.out.println("Valores atualizados "+vet[i]);
        }
    }
    
}
