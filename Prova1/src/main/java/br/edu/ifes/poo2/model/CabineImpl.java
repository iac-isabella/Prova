/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.model;


public class CabineImpl implements Cabine, Cloneable {
    private int capacidade;

    public CabineImpl(int capacidade) {
        this.capacidade = capacidade;
    }

    
    public int getCapacidade() {
        return capacidade;
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
