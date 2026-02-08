package com.composicao.app;
import javax.swing.JOptionPane;
import com.composicao.models.Pessoa;
import com.composicao.models.Veiculo;


public class App {
    public static void main(String[] args) throws Exception {
        Pessoa motorista = new Pessoa();
        Veiculo carro = new Veiculo();
// entrada de dados do motorissta
motorista.setNome(JOptionPane.showInputDialog("Informe o nome do motorista: "));
motorista.setCpf(JOptionPane.showInputDialog("Informe o CPF do motorista: "));
motorista.setTelefone(JOptionPane.showInputDialog("Informe o telefone do motorista: "));

 // entrada de dados do carro
 carro.setMarca(JOptionPane.showInputDialog("Informe a marca do carro: "));
 carro.setModelo(JOptionPane.showInputDialog("Informe a modelo do carro: "));
 carro.setAno(JOptionPane.showInputDialog("Informe o ano do carro: "));
 carro.setCor(JOptionPane.showInputDialog("Informe a cor do carro: "));
 carro.setPlaca(JOptionPane.showInputDialog("Informe a placa do carro: "));

carro.setProprietario = (motorista);

// saida de dados
JOptionPane.showMessageDialog(
    null,
    "Marca: " + carro.getMarca()+
    "\n Ano: " + carro.getAno()+
    "\n Cor: " + carro.getCor()+
    "\n Placa: " + carro.getPlaca()+
    "\n Dono do veículo: " + carro.getProprietario().getNome() +
    "\n CPF: " + carro.getProprietario().getCpf()+
    "\n Telefone do dono do Veículo: " + carro.getProprietario().getTelefne()
);

    }
}
