
package ExemplosDeFuncoes;

import java.util.Scanner;
import java.time.Clock;

public class HoraDia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o horário atual: ");
        double hora = scan.nextDouble();
        
        horario(hora);
    }
    
    public static void horario(double hora){
        if(hora >= 5 && hora <= 11 ){
            System.out.println("Bom Dia!");
        }else if(hora >= 11 && hora <= 18){
            System.out.println("Boa Tarde!");
        }else if(hora > 18 && hora < 24 || hora == 0){
            System.out.println("Boa Noite!");
        }else if (hora >= 1 && hora < 5)
            System.out.println("Boa Madrugada");
        
    }
}

