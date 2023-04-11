/*
03) Ler um conjunto de números reais, armazenando-o em vetor
e calcular o quadrado dos componentes deste vetor,
armazenando o resultado em outro vetor.
Os conjuntos tem 10 elementos cada. Imprimir todos os conjuntos.
 */
package arrays;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        
        int cont = 0;
        int cond = 10;
        double numbers[] = new double[cond];
        double sum[] = new double [cond];
         
        System.out.println("Entre com 10 números.\n");
        for(int i = 0; i < cond; i++){
            
            System.out.print((i+1) + "º número: ");
            numbers[i] = scan.nextDouble();
            
            sum[i] = numbers[i] * numbers[i];
            
            System.out.println("O quadrado do " + (cont+1) + "º valor: " + numbers[i] +
                " x " + numbers[i]+ " = " + sum[i]+ "\n");
            cont++;
         }
        
    }
}
