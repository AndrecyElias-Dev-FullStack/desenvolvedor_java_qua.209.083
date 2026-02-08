package com.novacalculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

//Instancia a classe Scanner
Scanner leia = new Scanner(System.in);

// Declaração de variáveis

double x;
double y;
double resultado = 0.0;
String operacao;

// Loop ( estrutura de repetição) (do)(while)
do {
    //menu
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Mltiplicação");
    System.out.println("4 - Divisão");
    System.out.println("5 - Resto da divisão");
    System.out.println("6 - Potência");
    System.out.println("7 - Sair do programa");
    System.out.println("Informe a Opção desejada:");
    operacao = leia.nextLine();

    if (!operacao.equals("7"));{
   System.out.println("Informe o valor de x ");
   x = leia.nextDouble();
   System.out.println("Informe o valor de y ");
   y = leia.nextDouble();

   leia.nextLine();

   switch (operacao){
    case "1":
    resultado = x+y;
    break;

    case "2":
    resultado = x-y;
    break;

    case "3":
    resultado = x*y;
    break;

    case "4":
    resultado = x/y;
    break;

    case "5":
    resultado = x%y;
    break;

    case "6":
    resultado = math.pow(x,y);
    break;
default:
System.out.println("Operador Inválido");
   }
//mosstrar o resultado
System.out.println("Resultado: " + resultado);
}

} while(!operacao.equals("7"));

//Fecha objeto Leia
leia.close();

    }
}
