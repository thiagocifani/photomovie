/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photomovie;

import java.util.Date;

/**
 *
 * @author thiagocifani
 */
public class PessoaFisica extends Cliente {
    String nome;
    String cpf;

    public PessoaFisica(String endereco, String telefone, String email, Date data_do_casamento, String cidade_do_casamento, String horario_do_casamento) {
        super(endereco, telefone, email, data_do_casamento, cidade_do_casamento, horario_do_casamento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
