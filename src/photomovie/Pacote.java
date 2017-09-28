/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photomovie;

/**
 *
 * @author thiagocifani
 */
public class Pacote {
    int cameras;
    int horas;
    int clipes;
    float valor;

    public Pacote(int cameras, int horas, int clipes, float valor) {
        this.cameras = cameras;
        this.horas = horas;
        this.clipes = clipes;
        this.valor = valor;
    }

    public int getCameras() {
        return cameras;
    }

    public void setCameras(int cameras) {
        this.cameras = cameras;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getClipes() {
        return clipes;
    }

    public void setClipes(int clipes) {
        this.clipes = clipes;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
