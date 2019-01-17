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
public class Boletin_17_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato Garfield = new Gato();
        System.out.println("[*] Bloque del Gato:\n" + Garfield.caminar() + "\n" + Garfield.nadar());
        /**
         *  - Precisas incluir todolos métodos das interfaces na clase Gato?
         *      : No, porque es un mamífero y hereda el método "caminar()" directamente de la superclase.
         */
        Papagayo Loro = new Papagayo();
        System.out.println("\n[*] Bloque del Papagayo:\n" + Loro.caminar());
    }
}