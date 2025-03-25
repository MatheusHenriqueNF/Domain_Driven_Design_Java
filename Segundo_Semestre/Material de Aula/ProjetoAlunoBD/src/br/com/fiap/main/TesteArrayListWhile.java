package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;
import java.util.ArrayList;

public class TesteArrayListWhile {
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
        ArrayList<Aluno> listaAlunos= new ArrayList<Aluno>(3);

        Aluno objAluno = null;

        int condicao = 0;

        while (condicao == 0){
            objAluno = new Aluno();

            objAluno.setRm(inteiro("RM: "));
            objAluno.setNome(texto("Nome: "));
            objAluno.setTurma(texto(("Turma: ")));
            objAluno.setNota(real("Nota: "));

            listaAlunos.add(objAluno);
            condicao = JOptionPane.showConfirmDialog(null,
                    "Cadastrara mais aluno?",
                    "Titulo",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
        }

        for (Aluno a : listaAlunos){
            System.out.println(
                    "\nRM: " + a.getRm() +
                            "\nNome: " + a.getNome() +
                            "\nTurma: " + a.getTurma() +
                            "\nNota: " + a.getNota()
            );
        }
    }
}
