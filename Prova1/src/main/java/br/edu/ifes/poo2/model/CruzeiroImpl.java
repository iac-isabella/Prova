/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.model;

import java.util.List;


public class CruzeiroImpl implements Cruzeiro, Cloneable {

    private Motor motor;
    private List<Cabine> cabine;
    private List<Bote> botes;
    private CabineComandante comandante;
    
    @Override
    public void exibirInfo() {
        comandante.getCabine();
        System.out.println("Motor:"+motor.getPotencia());
        System.out.println("Botes:"+botes.size()+" - Capacidade:"+ botes.get(0).getCapacidade());
        System.out.println("Cabines:"+cabine.size()+" - Capacidade:"+ cabine.get(0).getCapacidade());
    }
    
    public Object clone(){
        CruzeiroImpl c = null;
        try{
            c = (CruzeiroImpl) super.clone();
        }catch(Exception e){
            e.printStackTrace();
        }
        c.setMotor(motor);
        c.setCabine(cabine);
        c.setBotes(botes);
        c.setComandante(comandante);
        return c;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public List<Cabine> getCabine() {
        return cabine;
    }

    public void setCabine(List<Cabine> cabine) {
        this.cabine = cabine;
    }

    public List<Bote> getBotes() {
        return botes;
    }

    public void setBotes(List<Bote> botes) {
        this.botes = botes;
    }

    public CabineComandante getComandante() {
        return comandante;
    }

    public void setComandante(CabineComandante comandante) {
        this.comandante = comandante;
    }
    
    
}
