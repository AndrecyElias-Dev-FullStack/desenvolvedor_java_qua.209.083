package com.atividade02.app;
import java.util.Scanner;
// Apenas a biblioteca Scanner é importada

public class App {

    public static void main(String[] args) {

        // Instancia a classe Scanner
        Scanner leia = new Scanner(System.in);
        
        // declaração de váriáveis
        double a, b, x;
        
        // recebendo dados
        System.out.println("CAUCULANDO A EQUAÇÃO DO 1º GRAU (ax + b = 0)");
        
        //recebendo o valor de 'a'
        System.out.print("DIGITE O VALOR DE 'a': ");
        a = leia.nextDouble();

        // caso 'a' seja igual a zero (0)
        if (a == 0) {
            System.out.println("\n ATENÇÃO!: 'a' NÃO PODE SER IGUAL A ZERO (0).");
        } else {
            //caso 'a' seja diferente de (0) recebe os dados de 'b'
            System.out.print("DIGITE O VALOR DE 'b': ");
            b = leia.nextDouble();

            //Calculando o valor de 'x'
            x = -b / a;

            // 5. Exibe o resultado usando APENAS concatenação
            System.out.println("\n RESULTADO");
            
            // O valor de 'x' será exibido com toda a precisão double
            System.out.println("A EQUAÇÃO: (" + a + ")x + (" + b + ") = 0");
            System.out.println("O valor de X = " + x);
        }

        // Fecha o objeto Scanner
        leia.close();
    }
}