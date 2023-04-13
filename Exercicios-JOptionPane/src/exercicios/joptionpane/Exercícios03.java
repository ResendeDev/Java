package exercicios.joptionpane;

import javax.swing.JOptionPane;

public class Exercícios03 {
    public static void main(String[] args) {
        reajusteSalario();
    }
    
    public static void reajusteSalario () {
        double salarioAnterior = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor do seu salário: "));
        
        JOptionPane.showMessageDialog(null, "O valor do seu salário apos o reajuste é $" + (salarioAnterior * 10 / 100 + salarioAnterior));
        
    }
}
