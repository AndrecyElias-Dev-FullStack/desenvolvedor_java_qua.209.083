package com.combustivel.app;

import javax.swing.JOptionPane;
import com.combustivel.models.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
        Combustivel combustivel = new Combustivel();
// array

String[] opcoes = {"Informar valores", "Sair do programa"};
Object opcao;

do{

    
    //entrada de dados
    opcao = JOptionPane.showInputDialog(
    null, 
    "Seleecione uma Opção:", 
    "Selcione algo", 
    null, 
    opcoes[0], 
    opcao
    );

    if (opcao != "Sair do programa"){
    
    }
    
    
    combustivel.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da Gasolina: ").replace(",", ".")));
    combustivel.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Etanol : ").replace(",", ".")));
    
    JOptionPane.showMessageDialog(null, combustivel.calcularCombustivel());
    
    
} while(opcao != "Sair do Programa");

    }
}
