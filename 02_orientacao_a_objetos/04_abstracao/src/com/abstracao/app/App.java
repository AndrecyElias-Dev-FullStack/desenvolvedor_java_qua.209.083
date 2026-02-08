package com.abstracao.app;

import java.util.Scanner;

import com.abstracao.model.Carro;
import com.abstracao.models.Moto;

public class App {
public static void main(String[] args) throws Exception {

//instancia Scanner
Scanner leia = new Scanner();
// instancia as classes
Carro carro = new Carro();
Moto moto = new Moto ();

// declarar variavel
String combustivel;


//entrada de dados
System.out.println("Inform os dados do carro : ");
System.out.println("Inform o fabricante : ");
carro.fabricante = leia.nextLine();
System.out.println("Inform o modelo : ");
carro.modelo = leia.nextLine();
System.out.println("Inform o Cor : ");
carro.cor = leia.nextLine();
System.out.println("Inform o ano : ");
carro.ano = leia.nextLine();
System.out.println("Inform o placa : ");
carro.placa = leia.nextLine();

//padrao de combustível
carro.motorFlex = false;
carro.motoEletrico = false;
carro.motoDisel = false;

//Usuário informa o tipo de combustível
System.out.println("\n Informe o tipo de combustível");
System.out.println("1 - Gasolina");
System.out.println("2 - Etanol");
System.out.println("3 - Gasolina ou etanol");
System.out.println("4 - Tanto gasolina quanto etanol");
System.out.println("5 - Disel");
System.out.println("6 - Eletrico");

combustivel = leia.nextLine();

switch (combustivel) {
    case "1":
    carro.motorGasolina = true;
        break;

    case "2":
    carro.motorEtanol = true;
        break;

    case "3":
    carro.motorFlex = true;
        break;

    case "4":
    carro.motorDisel = true;
        break;
        
    case "5":
    carro.motorEletrico = true;
        break;

        default:
        System.out.println("Motor inexistente!");
}

// Entrada de dados da moto
System.out.println("Informe os dados da moto \n");
System.out.println("Informe o fabricante");
moto.fabricante = leia.nextLine();
System.out.println("Informe o modelo ");
moto.modelo = leia.nextLine();
System.out.println("Informe a cor");
moto.cor = leia.nextLine();
System.out.println("Informe o ano");
moto.ano = leia.nextLine();
System.out.println("Informe a placa");
moto.placa = leia.nextLine();

// saida de dados
System.out.println("\n Dados do carro: \n");
carro.exibirDados();
System.out.println("\n Dados da Moto: \n");
moto.exibirDados();


// Fechar objeto leia
leia.close();

    }
}
