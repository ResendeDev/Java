package exercicios.joptionpane;

import javax.swing.JOptionPane;

public class Exercícios04 {

    public static void main(String[] args) {
        calculadora();
    }

    public static void calculadora() {
        int numero[] = new int[2];
        int operacao = 0;
        double conversao = 0.;
      

        for (int i = 0; i < 2; i++) {
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o " + (i + 1) + "º número: "));

        }
        
        Object operacoes[] = {"Adição","Subtração","Multiplicação","Divisão"};
        Object opcao = JOptionPane.showInputDialog(null,"Selecione uma opção", "Calculadora", JOptionPane.QUESTION_MESSAGE, null, operacoes, operacoes[0]);

        if (opcao == "Adição") {
//               JOptionPane.showMessageDialog(null, "Resultado da adição = " + (numero[0] + numero[1]));]
            operacao = numero[0] + numero[1];
            JOptionPane.showMessageDialog(null, operacao);
        }else if(opcao == "Subtração") {
            operacao = numero[0] - numero[1];
            JOptionPane.showMessageDialog(null, operacao);
        }else if(opcao == "Multiplicação") {
            operacao = numero[0] * numero[1];
            JOptionPane.showMessageDialog(null, operacao);
        }else if(opcao == "Divisão") {
            
            conversao = (Double.valueOf(numero[0]) / Double.valueOf(numero[1]));
            System.out.println(conversao);
            JOptionPane.showMessageDialog(null, conversao);
        }
        
        
        
    }

}
