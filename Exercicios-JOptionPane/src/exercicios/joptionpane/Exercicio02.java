
package exercicios.joptionpane;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        tipoTriangulo();
    }
    
    public static void tipoTriangulo() {
        double lados[] = new double [3];
        
        for(int i = 0; i < 3; i++) {
            lados[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do " + (i+1) + "º lado: "));
        
        }
        
         if((lados[0] - lados[1]) < lados[2] && lados[2] < (lados[0] + lados[1])) {
                if(lados[0] == lados[1] && lados[1] == lados[2]) {
                    JOptionPane.showMessageDialog(null, "Triângulo equilátero.");
                }else if(lados[0] == lados[1] || lados[1] == lados[2] || lados[0] == lados[2]){
                    JOptionPane.showMessageDialog(null, "Triângulo isóleces.");
                }else {
                    JOptionPane.showMessageDialog(null, "Triângulo escaleno.");
                }
            }else {
            JOptionPane.showMessageDialog(null, "Não é possivel criar um triângulo com essas medidas.", "Alerta de Sistema", JOptionPane.WARNING_MESSAGE);
         }
     
        
    }
    
}
