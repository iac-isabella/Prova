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
public class Diretor {
    public Cruzeiro build(BuilderCruzeiro builder){
    
        builder.addMotor();
        builder.addComandante();
        builder.addPassageiros();
        builder.addBotes();
        return builder.retornarBarco();
    
    }
}
