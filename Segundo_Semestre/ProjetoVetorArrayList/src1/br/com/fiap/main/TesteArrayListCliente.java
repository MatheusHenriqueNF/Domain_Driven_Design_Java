package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

import javax.swing.*;
import java.util.ArrayList;

public class TesteArrayListCliente {

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

        // Preparar a Lista
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

        // Preparar objeto null
        Cliente objCliente = null;

        // Laço de repetição (entrada)
        do {
            objCliente = new Cliente();
            objCliente.setCpf(texto("CPF"));
            objCliente.setNome(texto("Nome"));
            objCliente.setIdade(inteiro("Idade"));
            objCliente.setNumeroCelular(texto("Numero de celular"));
            objCliente.setRenda(real("Renda"));

            listaClientes.add(objCliente);

        }while( JOptionPane.showConfirmDialog(null,
                "Cadastrar mais Clientes?",
                "CADASTRO DE CLIENTES",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE)  == 0 );

         // Saidas utilizando foreach
         for(Cliente c : listaClientes){
             System.out.println(
                     "\n\nCPF: " + c.getCpf()  +
                     "\nNome: " + c.getNome()  +
                     "\nIdade: " + c.getIdade() +
                     "\nNumero de celular: " + c.getNumeroCelular() +
                     "\nRenda: " + c.getRenda()
             );
         }


    }

}
