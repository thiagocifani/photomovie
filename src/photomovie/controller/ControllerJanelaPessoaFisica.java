/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photomovie.controller;

import photomovie.DAO.PessoaFisicaDAO;
import photomovie.models.PessoaFisica;

/**
 *
 * @author thiago
 */
public class ControllerJanelaPessoaFisica {

    private PessoaFisica pessoa;
    private final PessoaFisicaDAO pessoaDao = new PessoaFisicaDAO();

    public Boolean cadastrarPessoa(String nome, String cpf, String endereco, String telefone, String email, String data_do_casamento, String cidade_do_casamento, String horario_do_casamento) {
        pessoa = new PessoaFisica(nome, cpf, endereco, telefone, email, data_do_casamento, cidade_do_casamento, horario_do_casamento);
        return pessoaDao.inserir(pessoa);
        
    }
}
