package com.entrada.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // instância do objeto leia
        Scanner leia = new Scanner(System.in);

// declarar variáveis
String nome;
int idade;
double altura;
String email;

        //entrada de dados
System.out.println("Inoforme seu nome: ");
nome = leia.nextLine();
System.out.println("Informe sua idade: ");
idade = leia.nextInt();
System.out.println("Informe sua altura ");
altura = leia.nextDouble();

//limpeza de baffer deve se colocado depois de double ou sempre que o dado anterior não for String
leia.nextLine();

System.out.println("Informe seu email ");
email = leia.nextLine();

// saida de dados

System.out.println("Nome: " + nome);
System.out.println("Idade: " + idade + " anos");
System.out.println("Altura: " + altura + " m");
System.out.println("Email: " + email);

// o leia fica grifado e isso pode ser interpretado de forma negativa, as não influencia e nada na execução do codigo, mas caso queira que a grifagem suma digite
//leia.close();
    }
}
