/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photomovie.models;

/**
 *
 * @author thiagocifani
 */
public class PessoaJuridica extends Cliente {
    String razaoSocial;
    String cnpj;

    public PessoaJuridica(String endereco, String telefone, String email, String data_do_casamento, String cidade_do_casamento, String horario_do_casamento) {
        super(endereco, telefone, email, data_do_casamento, cidade_do_casamento, horario_do_casamento);
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
