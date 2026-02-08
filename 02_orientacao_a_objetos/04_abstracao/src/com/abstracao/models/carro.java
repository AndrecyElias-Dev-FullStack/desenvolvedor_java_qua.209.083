package com.abstracao.models;

final public class Carro extends Veiculo {

// procure estuda a troca do nome carro com letra minuscula para letra maiúscula



public boolean motorEletrico;
public boolean motorFlex;
public boolean motorDisel;
public boolean motorGasolina;
public boolean motorEtanol;

//

    public Carro() {
    }
    public void exibirDados(){
        super.exibirDados();
        if(motorEletrico == true){
            System.out.println("motor: Eletrico ");
            if(motorFlex == true){
                System.out.println("motor: Flex ");
                if(motorDisel == true){
                    System.out.println("motor: Disel ");
            

                    if(motorGasolin == true){
                        System.out.println("motor: Gasolina ");
                        if(motorEtanol == true){
                            System.out.println("motor: Etanol ");


        }
    }

}