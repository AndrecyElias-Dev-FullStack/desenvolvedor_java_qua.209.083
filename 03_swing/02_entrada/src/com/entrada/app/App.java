package com.entrada.app;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {

        // variavel
        String nome;
        int idade;


        nome = JOptionPane.showInputDialog("Informe seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

        // verifica a maior idade
        resultado = (idade >= 18) ? "é maior de idade":"é menor de idade";

        //saida de dados
        JOptionPane.showMessageDialog(null, nome + "" + resultado + ".");

    }
}
