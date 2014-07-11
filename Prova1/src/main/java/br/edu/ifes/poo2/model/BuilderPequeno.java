/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isabella
 */
public class BuilderPequeno implements BuilderCruzeiro{

    private Cruzeiro cruzeiro;

    public BuilderPequeno(Cruzeiro cruzeiro) {
        this.cruzeiro = cruzeiro;
    }
    
    
    @Override
    public void addMotor() {
       this.cruzeiro.setMotor(new MotorImpl(100)); 
    }

    @Override
    public void addComandante() {
        this.cruzeiro.setComandante(new CabineComandanteImpl());
    }

    @Override
    public void addPassageiros() {
        List<Cabine> l = new ArrayList<>();
        for(int cont = 0; cont<10; cont++){
            l.add(new CabineImpl(1));
        }
        this.cruzeiro.setCabine(l);
        
    }

    @Override
    public void addBotes() {
        List<Bote> l = new ArrayList<>();
        for(int cont = 0; cont<5; cont++){
            l.add(new BoteImpl(1));
        }
        this.cruzeiro.setBotes(l);
    }

    @Override
    public Cruzeiro retornarBarco() {
        return this.cruzeiro;
    }
    
}
