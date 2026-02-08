package com.alfandega.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

//Instancia a classe Scanner
Scanner leia = new Scanner(System.in);

// Declaração de variáveis
String nome;
String resultado;
double valor;

// Entrada de dados
System.out.println("Receba o nome do passageiro: ");
nome = leia.nextLine();
System.out.println("Informe o valor da bagagem em dólares: ");
valor = leia.nextDouble();

// Verificar o valor
resultado = (valor <= 1000) ? "BAGAGEM LIBERADA." : "BAGAGEM RETIDA.";
// mostrar resultado
System.out.println(nome + resultado);

//Fecha objeto Leia
leia.close();

    }
}
