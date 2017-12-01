/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photomovie.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import photomovie.models.PessoaFisica;

/**
 *
 * @author thiago
 */
public class PessoaFisicaDAO {

    static final String CAMINHO = "jdbc:mysql://localhost/photo_movie";

    public Boolean inserir(PessoaFisica pessoa) {
        String query = "INSERT INTO pessoa_fisica (nome, cpf, endereco, telefone, email, data_do_casamento, cidade_do_casamento, horario_do_casamento)"
                + " values (?, ?, ?, ?, ?, ?, ?, ?)";
        try {

            Connection conexao
                    = DriverManager.getConnection(CAMINHO, "root", "");
            PreparedStatement preparedStmt
                    = conexao.prepareStatement(query);

            preparedStmt.setString(1, pessoa.getNome());
            preparedStmt.setString(2, pessoa.getCpf());
            preparedStmt.setString(3, pessoa.getEndereco());
            preparedStmt.setString(4, pessoa.getTelefone());
            preparedStmt.setString(5, pessoa.getEmail());
            preparedStmt.setString(6, pessoa.getData_do_casamento());
            preparedStmt.setString(7, pessoa.getCidade_do_casamento());
            preparedStmt.setString(8, pessoa.getHorario_do_casamento());
            boolean execute = preparedStmt.execute();
            return execute;
        } catch (SQLException sqlExcecao) {
            System.out.println("Erro na operação de BD: "
                    + sqlExcecao.getMessage());
            return false;
        }
    }
}
