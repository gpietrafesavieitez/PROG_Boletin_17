/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17_1;

/**
 *
 * @author Gabriel
 */
public class Gato extends Mamifero implements IPuedeNadar {
 
    @Override
    public String nadar(){ // Desarrollo método de la interfaz que implemento
        return "-   El Gato nada, pero no le gusta mucho el agua...";
    }
}