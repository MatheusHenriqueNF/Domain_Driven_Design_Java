package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;

public class TesteAlunoVetor {

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

        Aluno[] vetorAluno = new Aluno[2];

        int indicie = 0;

        do {

            vetorAluno[indicie] = new Aluno();
            vetorAluno[indicie].setNome(texto("Nome"));
            vetorAluno[indicie].setRm(inteiro("RM"));
            vetorAluno[indicie].setNota(real("Nota"));

            indicie++;

        }while (JOptionPane.showConfirmDialog(null, "Cadastrar aluno?", "CADASTRO ALUNO",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);

        for (int contador = 0; contador < indicie; contador++){
            System.out.println(
                    "\n\nNome: " + vetorAluno[contador].getNome() +
                            "\nRM: " + vetorAluno[contador].getRm() +
                            "\nNota: " +  vetorAluno[contador].getNota()
            );
        }

    }
}
