package com.media.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instancia da classe Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de váriáveis
        String nome;
        double nota;

        // Entradas de dados
        System.out.println("Informe o nome do aluno: ");
        nome = leia.nextLine();
        System.out.println("Informe a nota de 0 a 10: ");
        nota = leia.nextDouble();

        //Verifica  se a nota é vavidada
        if (nota >=0 && nota<=10) {
            //Todo <-- Isso significa para Fazer
            if (nota >=7) {
                System.out.println(nome + " Status: APROVADO");
            }
            else if (nota >=5){
                System.out.println(nome + " Status: RECUPERAÇÃO");
            }
            else{
                System.out.println(nome + " Staus: REPROVADO");
            }
        }
        else{
            System.out.println("Nota Inválida.");
        }

        // Fecha objeto Leia
        leia.close();

    }
}
