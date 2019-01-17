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
public class Boletin_17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato g = new Gato();
        System.out.println("[*] Bloque del Gato:\n" + g.caminar() + "\n" + g.nadar());

        Tigre t = new Tigre();
        System.out.println("\n[*] Bloque del Tigre:\n" + t.caminar() + "\n" + t.nadar());

        Avestruz a = new Avestruz();
        System.out.println("\n[*] Bloque del Avestruz:\n" + a.caminar());
        
        Papagayo p = new Papagayo();
        System.out.println("\n[*] Bloque del Papagayo:\n" + p.caminar() + "\n" + p.volar());

        Murcielago m = new Murcielago();
        System.out.println("\n[*] Bloque del Murcielago:\n" + m.caminar() + "\n" + m.volar());

    }
}