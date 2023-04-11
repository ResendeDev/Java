
package Revisão;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no
//sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence (Q1, Q2, Q3 ou Q4). O
//algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem
//escrever mensagem alguma).

import java.util.Scanner;



public class PlanoCartesiano {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        
        do{
            System.out.print("Digite a coordenada X: ");
            int abcissaX = scan.nextInt();

            System.out.print("Digite a coordenada Y: ");
            int ordenadaY = scan.nextInt(); 
            
            if(ordenadaY > 0 && abcissaX > 0){
                System.out.println("Quadrante 1.");
            }else if(ordenadaY > 0 && abcissaX < 0){
                System.out.println("Quadrante 2.");
            }else if(ordenadaY < 0 && abcissaX < 0){
                System.out.println("Quadrante 3.");
            } else if(ordenadaY < 0 && abcissaX > 0){
                System.out.println("Quadrante 4.");
            }
            
            if(ordenadaY == 0 || abcissaX == 0){
                exit = true;
            }
            
            
        }while(exit != true);
    }
    
}
