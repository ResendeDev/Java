
package Revisão;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Tabuada do número: ");
        int num = scan.nextInt();
        
        for(int i=1; i<=10; i++){
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }
    
}
