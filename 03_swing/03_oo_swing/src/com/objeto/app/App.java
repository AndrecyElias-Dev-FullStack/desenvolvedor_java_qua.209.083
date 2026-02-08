package com.objeto.app;

import javax.swing.JOptionPane;
import com.objeto.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
    // instancia
    Pessoa usuario = new Pessoa();
    
    // entrada de dados
    usuario.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
    usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));
    usuario.setCpf(JOptionPane.showInputDialog("Informe seu CPF: "));
    usuario.setEmail(JOptionPane.showInputDialog("Informe seu e-mail: "));
    usuario.setTelefone(JOptionPane.showInputDialog("Informe seu Telefone: "));


    // saida de dados
    JOptionPane.showConfirmDialog(null,
    "DADOS DO USUARIO: \n NOME: " + usuario.getNome() +
     "\n IDADE: " +  usuario.getIdade() +
     "\n CPF: " +  usuario.getCpf() +
     "\n E-Mail: " +  usuario.getEmail() +
     "\n TELEFONE: " +  usuario.getTelefone()
     );

    }

}
