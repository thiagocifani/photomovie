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
public class Pedido {
    int numero;
    Date data;
    Pacote pacote;

    public Pedido(int numero, Date data, Pacote pacote) {
        this.numero = numero;
        this.data = data;
        this.pacote = pacote;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }
    
    
    
}
