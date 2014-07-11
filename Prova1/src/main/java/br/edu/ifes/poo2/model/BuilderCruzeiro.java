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
public interface BuilderCruzeiro {

    public void addMotor();

    public void addComandante();

    public void addPassageiros();

    public void addBotes();

    public Cruzeiro retornarBarco();
}
