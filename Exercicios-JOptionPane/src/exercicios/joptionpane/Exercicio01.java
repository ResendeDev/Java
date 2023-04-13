package exercicios.joptionpane;

import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        pessoaMaisVelha();
    }

    public static void pessoaMaisVelha() {
        int idadeMaisVelha = 0;
        String nomePessoaMaisVelha = "a";

        int qtdPessoas = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de pessoas que irá utilizar o programa: "));

        for (int i = 0; i < qtdPessoas; i++) {
            String nomes[] = new String[qtdPessoas];
            int idades[] = new int[qtdPessoas];
            
            nomes[i] = JOptionPane.showInputDialog(null, "Qual é o seu nome? ");
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua idade? "));

            if (idades[i] > idadeMaisVelha) {
                nomePessoaMaisVelha = nomes[i];
                idadeMaisVelha = idades[i];
            }

        }

        JOptionPane.showMessageDialog(null, "O nome da pessoa mais velha é " + nomePessoaMaisVelha);

    }

}
