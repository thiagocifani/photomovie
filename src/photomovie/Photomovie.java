/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photomovie;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author thiagocifani
 */
public class Photomovie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PessoaFisica p = new PessoaFisica("Rua das Flores", "228898-5536", "email@gmail.com", Date.from(Instant.MIN), "Cabo Frio", "13:00");
        p.email = "cifani.thiago@gmail.com";
        p.nome = "Thiago Cifani";
        System.out.println(p.email + " " +  p.nome);
    }
    
}
