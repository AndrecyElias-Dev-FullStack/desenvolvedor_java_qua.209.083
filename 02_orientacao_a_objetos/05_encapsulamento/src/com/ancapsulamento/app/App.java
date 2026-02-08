package com.ancapsulamento.app;

import java.util.Scanner;
import com.encapsulamento.models.Pessoa;
public class App {
    public static void main(String[] args) throws Exception {
        //instancia a classe
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        //entrada de dados
        System.out.println("Informe seu nome: ");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe seu cpf: ");
        usuario.setCpf(leia.nextLine());
        System.out.println("Informe seu email: ");
        usuario.setEmail(leia.nextLine());
        System.out.println("Informe sua idade: ");
        usuario.setIdade(leia.nextInt());

        //saida de dados
        System.out.println("\n DADOS DO USUÁRIO");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("email: " + usuario.getEmail());
        System.out.println("Idade: " + usuario.getIdade());
     
//fechar objeto leia
leia.close();

    }
}
