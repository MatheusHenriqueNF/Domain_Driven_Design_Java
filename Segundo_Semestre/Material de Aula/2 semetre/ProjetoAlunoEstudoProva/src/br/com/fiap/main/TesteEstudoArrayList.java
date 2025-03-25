package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;
import java.util.ArrayList;

public class TesteEstudoArrayList {


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

        ArrayList<Aluno> listaAluno = new ArrayList<>();

        Aluno objAluno = null;

        do {
            objAluno = new Aluno();
            objAluno.setRm(inteiro("RM"));
            objAluno.setNome(texto("Nome"));
            objAluno.setTurma(texto("Turma"));
            objAluno.setNota(real("Nota"));

            listaAluno.add(objAluno);
        }while (JOptionPane.showConfirmDialog(null,
                "Cadastrar novo aluno?",
                "CADASTRAR NOVO ALUNO?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);

        for (Aluno a : listaAluno){
            System.out.println(
                    "\n\nRM: " + a.getRm() +
                    "\nNome: " + a.getNome() +
                    "\nTurma: " + a.getTurma() +
                    "\nNota: " + a.getNota()
            );
        }


    }
}
