/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.model;


public class CabineComandanteImpl implements CabineComandante, Cloneable {

    @Override
    public void getCabine() {
        System.out.println("Cabine do comandante!");
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
