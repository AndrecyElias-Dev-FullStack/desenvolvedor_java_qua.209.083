package com.tremfantasma.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Instancia a classe Scanner
        Scanner leia = new Scanner(System.in);
        
        // Variáveis
        String nome;
        int idade;
        double altura;

        //Entrada de dados
        System.out.println("Informe o Nome do usuário: ");
        nome = leia.nextLine();
        
        System.out.println("Informe a Idade do usuario: ");
        idade = leia.nextInt();

        System.out.println("Informe a Altura do usuário: ");
        altura = leia.nextDouble();

        //estrutura de decisão
        if (idade >= 14 && altura >= 1.5){
        System.out.println(nome + "Acesso Liberado.");
    }
    else {
        System.out.println(nome + "Acesso Não Altorizado.");
    }

        // Fecha objeto scanner
        leia.close();
    }
}