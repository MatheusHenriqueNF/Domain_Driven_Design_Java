package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

import javax.swing.*;
import java.util.ArrayList;

public class TesteClienteArrayList {

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
        ArrayList<Cliente> listaCliente = new ArrayList<>();

        Cliente objCliente = null;

        do {

            objCliente = new Cliente();
            objCliente.setNome(texto("Nome"));
            objCliente.setIdade(inteiro("Idade"));
            objCliente.setRenda(real("Renda"));

            listaCliente.add(objCliente);

        }while (JOptionPane.showConfirmDialog(null, "Cadastrar cliente?", "CADASTRO CLIENTE",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);

        for (Cliente c : listaCliente){
            System.out.println(
                    "\n\nNome: " + c.getNome() +
                            "\nIdade: " + c.getIdade() +
                            "\nRenda: " + c.getRenda()
            );

        }
    }
}
