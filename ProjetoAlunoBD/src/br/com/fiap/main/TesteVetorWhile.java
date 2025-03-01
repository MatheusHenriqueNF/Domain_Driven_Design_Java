package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;

public class TesteVetorWhile {

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

        Aluno[] vetorAluno = new Aluno[3];

        int indice = 0;
        int condicao = 0;

        while(condicao == 0){

            vetorAluno[indice] = new Aluno();
            vetorAluno[indice].setRm(inteiro("RM: "));
            vetorAluno[indice].setNome(texto("Nome: "));
            vetorAluno[indice].setTurma(texto("Turma: "));
            vetorAluno[indice].setNota(real(("Nota: ")));

            indice++;

            condicao = JOptionPane.showConfirmDialog(null,
                    "Cadastrara mais aluno?",
                            "Titulo",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            for (int contador = 0; contador < indice; contador++){
                System.out.println(
                        "\nRM: " + vetorAluno[contador].getRm() +
                                "\nNome: " + vetorAluno[contador].getNome() +
                                "\nTurma: " + vetorAluno[contador].getTurma() +
                                "\nNota: " + vetorAluno[contador].getNota()
                );
            }
        }

    }


}
