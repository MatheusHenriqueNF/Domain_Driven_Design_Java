package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    // metodo para conectar o projeto com o banco de dados
    public Connection conexao() throws ClassNotFoundException, SQLException {

        // Driver
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // retornar a conexao com o banco de dados
        return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl" ,
                "seu usuario oracle" , "sua senha oracle" );
    }

}
