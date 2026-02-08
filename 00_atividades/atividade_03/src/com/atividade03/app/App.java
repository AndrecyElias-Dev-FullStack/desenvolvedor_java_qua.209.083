package com.atividade03.app;
        //ATIVIDADE 03
        /*
        * CRIE UM PROGRAMA QUE RECEBA DO USUÁRIO:
        * - NOME
        * - PESO Kg
        * - ALTURA EM METROS
        * - E DEPOIS CALCULE E EXIBA NA TELA O IMC
        * - APOS EXIBA O IMC, EXIBA O DIAGNOSTICO DE ACORDO COM A TABELA DO IMC
        */
//*
        // Importar as classes necessárias
       // import java.util.Scanner;
        //public class App {
       // public static void main(String[] args) throws Exception {
        
      //  Scanner leia = new Scanner(System.in);

        // Declaração de variáveis
      //  String nome;
      //  double peso;
      //  double medida;
      //  double imc;
      //  String diagnostico;

        // Receber dados do usuário
     //   System.out.println(" ----------- CÁLCULO DE ÍNDICE DE MASSA CORPORAL (IMC) -----------");
     //   System.out.print("DIGITE O  NOME: ");
     //   nome = leia.nextLine();

     //   System.out.print("DIGITE O PESO: ");
     //   peso = leia.nextDouble();

     //   System.out.print("DIGITE A ALTURA: ");
     //   medida = leia.nextDouble();

        //Fechando o leia
     //   leia.close();

        // Cálculo do IMC: Peso / (Altura * Altura)
   //     imc = peso / (medida * medida);

        // Determinação do Diagnóstico
     //   if (imc < 18.5) {
     //       diagnostico = "ABAIXO DO PESO IDEAL";
    //    } else if (imc < 25) {
     //       diagnostico = "PESO NORMAL (SAUDÁVEL)";
     //   } else if (imc < 30) {
    //        diagnostico = "SOBREPESO";
   //     } else if (imc < 35) {
     //       diagnostico = "OBESIDADE GRAU 1";
    //    } else if (imc < 40) {
    //        diagnostico = "OBESIDADE GRAU 2(SEVERA)";
    //    } else {
    //        diagnostico = "OBESIDADE GRAU 3 (MÓRBIDA)";
     //   }

        // Saída de dados formatada
    //    System.out.println("\n------------------ DIAGNÓSTICO ------------------");
    //    System.out.println("NOME: " + nome);
     //   System.out.println("PESO: " + peso + " kg");
        // O String.format agora usa o Locale padrão do sistema para exibir o IMC.
    //    System.out.println("IMC CALCULADO: " + String.format("%.2f", imc));
   //     System.out.println("STATUS: " + diagnostico.toUpperCase());

        // Tabela de Referência do IMC
   //     System.out.println("\n--------------- TABELA DE REFERÊNCIA ---------------");
   //     System.out.println("IMC MENOR QUE 18.5:        ABAIXO DO PESO IDEAL");
   //     System.out.println("IMC 18.5 a 24.9:           SAUDÁVEL");
   //     System.out.println("IMC 25.0 a 29.9:           SOBREPESO");
   //     System.out.println("IMC 30.0 a 34.9:           OBESIDADE 1º GRAU");
    //    System.out.println("IMC 35.0 a 39.9:           OBESIDADE 2º GRAU (SEVERA)");
//        System.out.println("IMC MAIOR OU IGUAL A 40.0: OBESIDADE 3º GRAU (MÓRBIDA)");
 //       System.out.println("----------------------------------------------------");
   // }
//}

import java.util.Scanner;
public class App {
public static void main(String[] args) throws Exception {
        
Scanner leia = new Scanner(System.in);

// Declaração de variáveis
String nome;
double peso;
double altura;
double imc;
String diagnostico;

// recebendo dados
        System.out.print("DIGITE O  NOME: ");
        nome = leia.nextLine();

        System.out.print("DIGITE O PESO: ");
        peso = leia.nextDouble();

        System.out.print("DIGITE A ALTURA: ");
        altura = leia.nextDouble();

// calcular IMC
imc = peso/Math.pow(altura, 2);

// Exibo o IMC na tela
System.out.print(nome + ", o seu IMC é " + String.format("%.2,f",imc) + ".");


// Exibi o diagnóstico com operador ternário
diagnostico = (imc < 18.8) ? "ABAIXO DO PESO":
(imc < 25) ? "ESTA NO PESO NORMAL":
(imc < 30) ? "ESTA SOBREPESO":
(imc < 35) ? "ESTA NO 1º GRAU":
(imc < 40) ? "ESTA NO 2º GRAU":"ESTA NO 3º GRAU - MORBIDA";

// EXIBIR O RESULTADO
System.out.print(nome + " - " + diagnostico + ".");


//Fachando leia
leia.close();
}
}