/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.model;

import java.util.List;

/**
 *
 * @author Isabella
 */
public interface Cruzeiro {
    public void exibirInfo();
    public Object clone();
    
    public Motor getMotor();

    public void setMotor(Motor motor);

    public List<Cabine> getCabine();

    public void setCabine(List<Cabine> cabine);

    public List<Bote> getBotes();

    public void setBotes(List<Bote> botes);

    public CabineComandante getComandante();

    public void setComandante(CabineComandante comandante);
    
}
