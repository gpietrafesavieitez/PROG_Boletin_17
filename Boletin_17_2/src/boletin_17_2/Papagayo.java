/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17_2;

/**
 *
 * @author Gabriel
 */
public class Papagayo extends Aves implements IPuedeCaminar, IPuedeVolar {

    @Override
    public String caminar(){
        return "-   El Papagayo camina.";
    }
    
    @Override
    public String volar(){
        return "-   El Papagayo vuela.";
    }
}