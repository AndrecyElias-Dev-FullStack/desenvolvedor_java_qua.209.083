package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Instancia a classe Scanner
        Scanner leia = new Scanner(System.in);

        //declaração de variáveis
        String nome;
        int idade;

        //Entarda de dados
        System.out.println("INFORME O NOME: ");
        nome = leia.nextLine();
        System.out.println("INFORME A IDADE: ");
        idade = leia.nextInt();

        //estrutura de decisão
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        }
        else{
            System.out.println(nome + " é menor de idade.");
        }

        //fecha objeto leia
        leia.close();


    }
}
