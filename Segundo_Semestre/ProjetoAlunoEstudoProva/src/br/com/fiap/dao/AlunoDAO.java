package br.com.fiap.dao;

import br.com.fiap.beans.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {
    public Connection cn;

    public AlunoDAO(Connection cn) {
        super();
        this.cn = cn;
    }

    public String inserir (Aluno aluno) throws SQLException {
        PreparedStatement stmt = cn.prepareStatement("INSERT INTO T_AM_ALUNO (RM, NM_ALUNO, NM_TURMA, VL_NOTA) VALUES (?,?,?,?)");
        return "";
    }
}
