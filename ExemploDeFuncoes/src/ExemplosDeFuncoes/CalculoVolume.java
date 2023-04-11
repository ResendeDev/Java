
package ExemplosDeFuncoes;
/*
Crie um projeto em Java que calcule e apresente o valor do volume de
uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A, em que
as variáveis: V, R e A representam respectivamente o volume, o raio e
a altura.
Vamos declarar as variáveis V, R e A como double, onde o usuário vai
inserir as variáveis de altura e de raio. Agora vamos escrever a
fórmula, conforme dita no enunciado e, em seguida, exibir na tela uma
mensagem contendo o resultado do volume encontrado.
Lembrando que o cálculo deve ser realizado em um método
separado da main(). 
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoVolume {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Entre com a altura da lata de óleo: ");
        double a = scan.nextDouble();      
        
        System.out.println ("Entre com o raio da lata de óleo: ");
        double r = scan.nextDouble();
        
        volume(a,r);
    }
    
    public static double volume (double r ,double a) {
        DecimalFormat df = new DecimalFormat("##,00");
        double v = 3.14159 * r * r * a;
        
        System.out.println ("O volume da lata de óleo é igual a " + df.format(v));
        return v;
    }
}
