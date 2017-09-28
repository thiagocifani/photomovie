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
public class Cliente {
    String endereco;
    String telefone;
    String email;
    Date data_do_casamento;
    String cidade_do_casamento;
    String horario_do_casamento;

    public Cliente(String endereco, String telefone, String email, Date data_do_casamento, String cidade_do_casamento, String horario_do_casamento) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.data_do_casamento = data_do_casamento;
        this.cidade_do_casamento = cidade_do_casamento;
        this.horario_do_casamento = horario_do_casamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_do_casamento() {
        return data_do_casamento;
    }

    public void setData_do_casamento(Date data_do_casamento) {
        this.data_do_casamento = data_do_casamento;
    }

    public String getCidade_do_casamento() {
        return cidade_do_casamento;
    }

    public void setCidade_do_casamento(String cidade_do_casamento) {
        this.cidade_do_casamento = cidade_do_casamento;
    }

    public String getHorario_do_casamento() {
        return horario_do_casamento;
    }

    public void setHorario_do_casamento(String horario_do_casamento) {
        this.horario_do_casamento = horario_do_casamento;
    }
}
