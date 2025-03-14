package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

import javax.swing.*;

public class TesteVetorWhile {

    // String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    // int
    static  int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    static double real (String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        // Determinar a quantidade maxima de vetores
        Cliente[] vetorCliente = new Cliente[2]; // [0] [1]

        // fazer o indice para controlar as posições
        int indice = 0;

        int resposta = 0;

        // Laço de repetição (entradas)

        while(resposta == 0){
            vetorCliente[indice] = new Cliente();
            vetorCliente[indice].setCpf(texto("Informe o CPF"));
            vetorCliente[indice].setNome(texto("Nome do Cliente"));
            vetorCliente[indice].setIdade(inteiro("Idade"));
            vetorCliente[indice].setNumeroCelular(texto("Numero de celular"));
            vetorCliente[indice].setRenda(real("Renda"));

            indice++;

           resposta = JOptionPane.showConfirmDialog(null,
                    "Cadastrar mais Clientes?",
                    "CADASTRO DE CLIENTES",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

        }

        // Saidas utilizando for
        for(int contador = 0; contador < indice; contador++ ){
            System.out.println(
                    "\n\nCPF: " + vetorCliente[contador].getCpf() +
                            "\nNome: " + vetorCliente[contador].getNome() +
                            "\nIdade: " + vetorCliente[contador].getIdade() +
                            "\nNumero: " + vetorCliente[contador].getNumeroCelular() +
                            "\nRenda: " + vetorCliente[contador].getRenda()
            );
        }

    }



}
