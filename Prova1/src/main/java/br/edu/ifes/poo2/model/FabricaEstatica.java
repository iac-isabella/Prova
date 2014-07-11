/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.model;

/**
 *
 * @author Isabella
 */
public class FabricaEstatica {
    
    private static Diretor diretor = new Diretor();

    
    public static Cruzeiro make(String tipo){
        Cruzeiro cruzeiroPequeno = diretor.build(new BuilderPequeno(new CruzeiroImpl()));
        Cruzeiro cruzeiroMedio = diretor.build(new BuilderMedio(new CruzeiroImpl()));
        Cruzeiro cruzeiroGrande = diretor.build(new BuilderGrande(new CruzeiroImpl()));
        Cruzeiro barco = null;
        if(tipo.equals("pequeno")){
            barco = (Cruzeiro) cruzeiroPequeno.clone();
        }
        else if(tipo.equals("medio")){
            barco = (Cruzeiro) cruzeiroPequeno.clone();
        }
        else if(tipo.equals("grande")){
            barco = (Cruzeiro) cruzeiroPequeno.clone();
        }
        return barco;
    }
    
}
