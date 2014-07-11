/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.model;


public class MotorImpl implements Motor, Cloneable {
    private int potencia;

    public MotorImpl(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }
    
    public Object clone(){
        try{
            return super.clone();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
