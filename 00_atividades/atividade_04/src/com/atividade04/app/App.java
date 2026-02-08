package com.atividade04.app;
        //ATIVIDADE 04
	/*
        * CRIE UM PROGRAMA QUE RECEBA DO USUÁRIO: O NOME E IDADE.
        * - DEPOIS, EXIBA UM MENU COM 5 FILMES, SUAS RESPECTIVAS SALAS DE CINEMA E SUAS RESPECTIVAS CLASSIFICAÇÇÕES INDICATIVAS.
        * - O USUÁRIO DEVE ESCOLHER O FILME, E SE CASO TIVER IDADE MINIMA PARA LEVAR O FILME O PROGRAMA IMPRIME O INGRESSO E ENCERRA. 
        * - CASO O USUÁRIO NÃO TENHA IDADE MÍNIM, O PROGRAMA BLOQUEIA A ENTRADA DO USUÁRIO E EXIBE NOVAMENTE OS FILMES.
        * FILMES EM CARTAZ
        * SALA 1 - A RODA QUADRADA - LIVRE
        * SALA 2 - A VOLTA DOS QUE NÃO FORAM - 12 ANOS
        * SALA 3 - POEIRA EM ALTO MAR - 14 ANOS
        * SALA 4 - AS TRANÇAS DO REI CARECA - 16 ANOS
        * SALA 5 - A VINGANÇA DO PEIXE FRITO - 18 ANOS
         */
 
import java.util.Scanner;
public class App {
 public static void main(String[] args) throws Exception {
        
        String nome;
        int idade;
        int escolha;
        // Flag para controlar o loop: inicia como 'false' para que o menu seja exibido.
        boolean compraAutorizada = false; 
        

        System.out.println("          BEM-VINDO AO CINEMA JAVA!           ");

        
        // 1. Receber Nome e Idade do usuário
        System.out.print("Por favor, digite o seu NOME: ");
        nome = leia.nextLine();
        
        System.out.print("Por favor, digite a sua IDADE: ");
        // Garante que o usuário digite um número inteiro para a idade
        while (!leia.hasNextInt()) {
            System.out.println("Entrada inválida. Digite sua idade usando números inteiros.");
            leia.next(); // Descarta a entrada inválida
            System.out.print("Por favor, digite a sua IDADE: ");
        }
        idade = leia.nextInt();
        
        // Loop principal: Continua enquanto a compra não for autorizada
        while (!compraAutorizada) {
            
            // 2. Exibir o Menu de Filmes
            System.out.println("\n==============================================");
            System.out.println("           FILMES EM CARTAZ (Olá, " + nome + ")");
            System.out.println("==============================================");
            System.out.println("1. SALA 1 - A RODA QUADRADA - LIVRE");
            System.out.println("2. SALA 2 - A VOLTA DOS QUE NÃO FORAM - 12 ANOS");
            System.out.println("3. SALA 3 - POEIRA EM ALTO MAR - 14 ANOS");
            System.out.println("4. SALA 4 - AS TRANÇAS DO REI CARECA - 16 ANOS");
            System.out.println("5. SALA 5 - A VINGANÇA DO PEIXE FRITO - 18 ANOS");
            System.out.println("==============================================");
            System.out.print("Digite o número do filme desejado (1 a 5): ");
            
            // Checa se a escolha é um número antes de ler
            if (!leia.hasNextInt()) {
                System.out.println("\n[AVISO] Escolha inválida. Por favor, digite um número de 1 a 5.");
                leia.next(); // Descarta a entrada inválida e limpa o buffer
                continue; // Volta para o início do loop
            }
            
            escolha = leia.nextInt();
            
            String tituloFilme = "";
            int idadeMinima = -1; // Usamos -1 para indicar que a escolha ainda não foi definida ou é inválida
            String sala = "";
            
            // 3. Processar a escolha do usuário e definir a idade mínima
            switch (escolha) {
                case 1:
                    tituloFilme = "A RODA QUADRADA";
                    sala = "SALA 1";
                    idadeMinima = 0; // LIVRE
                    break;
                case 2:
                    tituloFilme = "A VOLTA DOS QUE NÃO FORAM";
                    sala = "SALA 2";
                    idadeMinima = 12;
                    break;
                case 3:
                    tituloFilme = "POEIRA EM ALTO MAR";
                    sala = "SALA 3";
                    idadeMinima = 14;
                    break;
                case 4:
                    tituloFilme = "AS TRANÇAS DO REI CARECA";
                    sala = "SALA 4";
                    idadeMinima = 16;
                    break;
                case 5:
                    tituloFilme = "A VINGANÇA DO PEIXE FRITO";
                    sala = "SALA 5";
                    idadeMinima = 18;
                    break;
                default:
                    System.out.println("\n[AVISO] Opção inválida. Por favor, escolha um filme de 1 a 5.");
                    continue; // Volta para o início do loop
            }
            
            // 4. Checagem da Classificação Indicativa
            if (idade >= idadeMinima) {
                // Usuário autorizado: Imprime o ingresso
                System.out.println("\n**********************************************");
                System.out.println("         INGRESSO - COMPRA AUTORIZADA         ");
                System.out.println("**********************************************");
                System.out.println("NOME DO CLIENTE: " + nome);
                System.out.println("FILME: " + tituloFilme);
                System.out.println("SALA: " + sala);
                System.out.println("CLASSIFICAÇÃO: " + (idadeMinima == 0 ? "LIVRE" : idadeMinima + " ANOS"));
                System.out.println("\nTenha um ótimo filme! Obrigado por sua visita.");
                System.out.println("**********************************************");
                
                compraAutorizada = true; // Sai do loop
                
            } else {
                // 5. Usuário bloqueado: Exibe mensagem e repete o menu
                System.out.println("\n==============================================");
                System.out.println("         ACESSO BLOQUEADO POR IDADE!          ");
                System.out.println("==============================================");
                System.out.println(nome + ", sua idade (" + idade + " anos) não atende a classificação indicativa de " + idadeMinima + " anos para o filme '" + tituloFilme + "'.");
                System.out.println("Por favor, escolha outro filme.");
                
                // O loop 'while' irá automaticamente reexibir o menu.
            }
        }
        
        // Fecha o Scanner ao final do programa.
        leia.close();
    }
}