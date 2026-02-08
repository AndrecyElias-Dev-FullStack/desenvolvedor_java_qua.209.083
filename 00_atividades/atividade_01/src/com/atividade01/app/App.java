package com.atividade01.app;
        /*Crie um programa que RECEBA DO USUÁRIO:
        * - NOME
        * - DATA DE NASCIMENTO
        * - CPF
        * - EMAIL
        * - TELEFONE
        * -  e EXIBA os dados na tela*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancia a classe Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração das variáveis
        String nome;
        String nascimento;
        String cpf;
        String email;
        String telefone;

        // Recebendo os dados do usuário
        System.out.print("DIGITE O NOME: ");
        nome = leia.nextLine();

        System.out.print("DIGITE A DATA DE NASCIMENTO (DD/MM/AAAA): ");
        nascimento = leia.nextLine();

        System.out.print("DIGITE O CPF: ");
        cpf = leia.nextLine();

        System.out.print("DIGITE O EMAIL: ");
        email = leia.nextLine();

        System.out.print("DIGITE O TELEFONE: ");
        telefone = leia.nextLine();

        System.out.println("\n--- DADOS DO USUÁRIO ---");
        System.out.println("NOME: " + nome);
        System.out.println("DATA DE NASCIMENTO: " + nascimento);
        System.out.println("CPF Nº: " + cpf);
        System.out.println("EMAIL: " + email);
        System.out.println("TELEFONE: " + telefone);

        // Fecha objeto Leia
        leia.close();

    }
}