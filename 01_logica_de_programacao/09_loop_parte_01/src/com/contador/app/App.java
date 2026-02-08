package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

//Instancia a classe Scanner
Scanner leia = new Scanner(System.in);

//Declaração de variáveis
int n;

//Entrada de dados
System.out.println("Informe um número inteiro: ");
n = leia.nextInt();

//loop( laço de repetição - Estrutura de repetição) While=enquanto) n-- (dedremento = n-1)
while (n>=0){
    System.out.println(n);
    n --;
}

//Fecha objeto Leia
leia.close();

    }
}