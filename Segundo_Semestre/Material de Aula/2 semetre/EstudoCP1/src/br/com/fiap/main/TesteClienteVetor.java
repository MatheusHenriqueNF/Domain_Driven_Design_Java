package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

import javax.swing.*;

public class TesteClienteVetor {


    static String texto (String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro (String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real (String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        Cliente[] vetorCliente = new Cliente[2];

        int indice = 0;

        do {

            vetorCliente[indice] = new Cliente();

            vetorCliente[indice].setNome(texto("Nome"));
            vetorCliente[indice].setIdade(inteiro("Idade"));
            vetorCliente[indice].setRenda(real("Renda"));

            indice++;

        }while (JOptionPane.showConfirmDialog(null, "Cadastrar mais cliente?", "CADASTRAR NOVO CLIENTE",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        for(int contador = 0; contador < indice; contador++){
            System.out.println(
                    "\n\nNome: " + vetorCliente[contador].getNome() +
                            "\nIdade: " + vetorCliente[contador].getIdade() +
                            "\nRenda: " + vetorCliente[contador].getRenda()
            );
        }

    }
}
