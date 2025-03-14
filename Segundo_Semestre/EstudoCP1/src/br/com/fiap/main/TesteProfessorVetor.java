package br.com.fiap.main;

import br.com.fiap.beans.Professor;

import javax.swing.*;

public class TesteProfessorVetor {

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

        Professor[] vetorProfessor = new Professor[2];

        int indice = 0;

        do {

            vetorProfessor[indice] = new Professor();
            vetorProfessor[indice].setNome(texto("Nome: "));
            vetorProfessor[indice].setIdade(inteiro("Idade: "));
            vetorProfessor[indice].setSalario(real("Salario"));

            indice++;

        }while (JOptionPane.showConfirmDialog(null, "Cadastrar novo professor?", "CADASTRO DE NOVO PROFESSOR",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);

        for (int contador = 0; contador < indice; contador++){
            System.out.println(
                    "\n\nNome: " + vetorProfessor[contador].getNome() +
                            "\nIdade: " + vetorProfessor[contador].getIdade() +
                            "\nSalario: " + vetorProfessor[contador].getSalario()
            );
        }

    }

}
