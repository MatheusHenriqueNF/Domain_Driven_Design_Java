package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

import javax.swing.*;

public class TesteVetorCliente {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        Cliente[] vetorCliente = new Cliente[2];

        int indicie = 0;

        do {
            vetorCliente[indicie] = new Cliente();
            vetorCliente[indicie].setCpf(texto("CPF: "));
            vetorCliente[indicie].setNome(texto("Nome: "));
            vetorCliente[indicie].setIdade(inteiro("Idade: "));
            vetorCliente[indicie].setNumeroCelcular(texto("Celular: "));
            vetorCliente[indicie].setRenda(real("Renda: "));

            indicie++;

        }while (
            JOptionPane.showConfirmDialog(null,
                    "Adicionar mais informações?",
                    "Continuar com novo cadastro",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == 0
        );

        for(int contador = 0; contador < indicie; contador++){
            System.out.println(
                "\nCPF: " + vetorCliente[contador].getCpf() +
                        "\nNome: " + vetorCliente[contador].getNome() +
                        "\nIdade: " + vetorCliente[contador].getIdade() +
                        "\nCelular: " + vetorCliente[contador].getNumeroCelular() +
                        "\nRenda: " + vetorCliente[contador].getRenda()
            );
        }
    }

}
